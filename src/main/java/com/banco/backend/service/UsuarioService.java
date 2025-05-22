package com.banco.backend.service;

import com.banco.backend.dto.UsuarioCuentaResponse;
import com.banco.backend.dto.UsuarioDetalleResponse;
import com.banco.backend.model.*;
import com.banco.backend.repository.*;
import com.banco.backend.util.AesEncryptor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PreguntaRepository preguntaRepository;
    private final RespuestaRepository respuestaRepository;
    private final ImagenSeguridadRepository imagenSeguridadRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository,
                          PreguntaRepository preguntaRepository,
                          RespuestaRepository respuestaRepository,
                          ImagenSeguridadRepository imagenSeguridadRepository,
                          PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.preguntaRepository = preguntaRepository;
        this.respuestaRepository = respuestaRepository;
        this.imagenSeguridadRepository = imagenSeguridadRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario registrarUsuario(Usuario usuario,
                                    List<String> respuestasPlanas,
                                    List<Pregunta> preguntasSeleccionadas,
                                    String nombreImagenSeleccionada) {

        if (respuestasPlanas.size() != 5 || preguntasSeleccionadas.size() != 5) {
            throw new IllegalArgumentException("Debe haber exactamente 5 preguntas y respuestas.");
        }

        // Encriptar contraseña
        usuario.setPasswordPlano(usuario.getPassword()); // ahora cifrado con AES

        // Asignar imagen de seguridad
        ImagenSeguridad imagen = imagenSeguridadRepository
                .findByNombreImagen(nombreImagenSeleccionada)
                .orElseGet(() -> imagenSeguridadRepository.save(
                        new ImagenSeguridad(null, nombreImagenSeleccionada))
                );

        usuario.setImagenSeguridad(imagen);

        // Guardar usuario sin respuestas aún
        Usuario usuarioGuardado = usuarioRepository.save(usuario);

        // Registrar las 5 respuestas encriptadas
        for (int i = 0; i < 5; i++) {
            Respuesta respuesta = new Respuesta();
            respuesta.setUsuario(usuarioGuardado);
            respuesta.setPregunta(preguntasSeleccionadas.get(i));
            respuesta.setRespuesta(respuestasPlanas.get(i));
            respuestaRepository.save(respuesta);
        }

        return usuarioGuardado;
    }

    public boolean validarRespuesta(Long usuarioId, Long preguntaId, String respuestaIngresada) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario == null) return false;

        List<Respuesta> respuestas = respuestaRepository.findByUsuario(usuario);
        return respuestas.stream().anyMatch(respuesta ->
                respuesta.getPregunta().getId().equals(preguntaId)
                        && respuesta.getRespuesta().equalsIgnoreCase(respuestaIngresada.trim())
        );
    }

    public boolean validarImagen(Long usuarioId, String nombreImagenSeleccionada) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario == null) return false;

        return usuario.getImagenSeguridad().getNombreImagenPlano().equals(nombreImagenSeleccionada);
    }

    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username).orElse(null);
    }
    
    public Usuario autenticar(String usernamePlano, String passwordPlano) {
        return usuarioRepository.findAll().stream()
            .filter(u -> u.getUsernamePlano().equals(usernamePlano)
                      && u.getPasswordPlano().equals(passwordPlano))
            .findFirst()
            .orElse(null);
    }

    
    public UsuarioDetalleResponse obtenerDetalleUsuario(Long idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);
        if (usuario == null) return null;

        List<Respuesta> respuestas = respuestaRepository.findByUsuario(usuario);

        List<UsuarioDetalleResponse.PreguntaRespuestaDTO> detalles = respuestas.stream().map(r -> {
            UsuarioDetalleResponse.PreguntaRespuestaDTO dto = new UsuarioDetalleResponse.PreguntaRespuestaDTO();
            dto.setIdPregunta(r.getPregunta().getId());
            dto.setTextoPregunta(r.getPregunta().getTextoPlano());
            dto.setRespuesta(r.getRespuesta()); // desencripta internamente
            return dto;
        }).collect(Collectors.toList());

        UsuarioDetalleResponse response = new UsuarioDetalleResponse();
        response.setId(usuario.getId());
        response.setUsername(usuario.getUsernamePlano());
        response.setPasswordPlano(usuario.getPasswordPlano());
        response.setImagenSeguridad(usuario.getImagenSeguridad().getNombreImagenPlano());
        response.setPreguntas(detalles);

        return response;
    }
    
    public UsuarioCuentaResponse obtenerInfoCuenta(Long idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);
        if (usuario == null) return null;

        UsuarioCuentaResponse dto = new UsuarioCuentaResponse();
        dto.setTipoCliente(usuario.getTipoClientePlano());
        dto.setTipoCuenta(usuario.getTipoCuentaPlano());
        dto.setNumeroCuenta(usuario.getNumeroCuentaPlano());
        dto.setSaldoDisponible(usuario.getSaldoDisponiblePlano());
        return dto;
    }
    
    public boolean validarRespuestaPorTexto(Long usuarioId, String textoPregunta, String respuestaIngresada) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario == null) return false;

        List<Respuesta> respuestas = respuestaRepository.findByUsuario(usuario);
        return respuestas.stream().anyMatch(respuesta ->
                respuesta.getPregunta().getTextoPlano().equalsIgnoreCase(textoPregunta.trim()) &&
                respuesta.getRespuesta().equalsIgnoreCase(respuestaIngresada.trim())
        );
    }




}
