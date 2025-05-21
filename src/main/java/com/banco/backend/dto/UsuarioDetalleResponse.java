package com.banco.backend.dto;

import java.util.List;

public class UsuarioDetalleResponse {
    private Long id;
    private String username;
    private String passwordPlano;
    private String imagenSeguridad;
    private List<PreguntaRespuestaDTO> preguntas;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswordPlano() {
		return passwordPlano;
	}
	public void setPasswordPlano(String passwordPlano) {
		this.passwordPlano = passwordPlano;
	}
	public String getImagenSeguridad() {
		return imagenSeguridad;
	}
	public void setImagenSeguridad(String imagenSeguridad) {
		this.imagenSeguridad = imagenSeguridad;
	}
	public List<PreguntaRespuestaDTO> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<PreguntaRespuestaDTO> preguntas) {
		this.preguntas = preguntas;
	}
	
	public static class PreguntaRespuestaDTO {
        private Long idPregunta;
        private String textoPregunta;
        private String respuesta; // ya desencriptada
		public Long getIdPregunta() {
			return idPregunta;
		}
		public void setIdPregunta(Long idPregunta) {
			this.idPregunta = idPregunta;
		}
		public String getTextoPregunta() {
			return textoPregunta;
		}
		public void setTextoPregunta(String textoPregunta) {
			this.textoPregunta = textoPregunta;
		}
		public String getRespuesta() {
			return respuesta;
		}
		public void setRespuesta(String respuesta) {
			this.respuesta = respuesta;
		}

        // Getters y setters
    }
}
