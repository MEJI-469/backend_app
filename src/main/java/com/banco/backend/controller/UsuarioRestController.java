package com.banco.backend.controller;

import com.banco.backend.dto.UsuarioCuentaResponse;
import com.banco.backend.dto.UsuarioDetalleResponse;
import com.banco.backend.dto.UsuarioRegistroRequest;
import com.banco.backend.model.Pregunta;
import com.banco.backend.model.Usuario;
import com.banco.backend.service.PreguntaService;
import com.banco.backend.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {

    private final UsuarioService usuarioService;
    private final PreguntaService preguntaService;

    public UsuarioRestController(UsuarioService usuarioService,
                                  PreguntaService preguntaService) {
        this.usuarioService = usuarioService;
        this.preguntaService = preguntaService;
    }

    // ✅ 1. Registro completo
    @PostMapping("/registrar")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody UsuarioRegistroRequest request) {

        if (request.getIdPreguntas().size() != 5 || request.getRespuestas().size() != 5) {
            return ResponseEntity.badRequest().build();
        }

        List<Pregunta> preguntas = request.getIdPreguntas().stream()
                .map(preguntaService::findById)
                .collect(Collectors.toList());

        Usuario nuevo = new Usuario();
        nuevo.setUsername(request.getUsername());
        nuevo.setPassword(request.getPassword());

        Usuario registrado = usuarioService.registrarUsuario(
                nuevo,
                request.getRespuestas(),
                preguntas,
                request.getNombreImagen()
        );

        return ResponseEntity.ok(registrado);
    }

    // ✅ 2. Validar respuesta
    @PostMapping("/validar-respuesta")
    public ResponseEntity<String> validarRespuesta(@RequestParam Long usuarioId,
                                                   @RequestParam Long preguntaId,
                                                   @RequestParam String respuestaIngresada) {
        boolean valida = usuarioService.validarRespuesta(usuarioId, preguntaId, respuestaIngresada);
        return valida ?
                ResponseEntity.ok("Respuesta correcta") :
                ResponseEntity.status(403).body("Respuesta incorrecta");
    }

    // ✅ 3. Validar imagen
    @PostMapping("/validar-imagen")
    public ResponseEntity<String> validarImagen(@RequestParam Long usuarioId,
                                                @RequestParam String nombreImagen) {
        boolean valida = usuarioService.validarImagen(usuarioId, nombreImagen);
        return valida ?
                ResponseEntity.ok("Imagen correcta") :
                ResponseEntity.status(403).body("Imagen incorrecta");
    }
    
 // ✅ 4. Login: validar usuario y contraseña
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username,
                                   @RequestParam String password) {
        Usuario usuario = usuarioService.autenticar(username, password);
        if (usuario == null) {
            return ResponseEntity.status(401).body("Credenciales inválidas");
        }

        // Puedes retornar solo datos básicos del usuario
        return ResponseEntity.ok("Login exitoso. ID Usuario: " + usuario.getId());
    }
    
    @GetMapping("/{id}/detalle")
    public ResponseEntity<?> obtenerDetalleUsuario(@PathVariable Long id) {
        UsuarioDetalleResponse detalle = usuarioService.obtenerDetalleUsuario(id);
        if (detalle == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(detalle);
    }
    
    @GetMapping("/{id}/cuenta")
    public ResponseEntity<?> obtenerCuenta(@PathVariable Long id) {
        UsuarioCuentaResponse cuenta = usuarioService.obtenerInfoCuenta(id);
        if (cuenta == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cuenta);
    }


}
