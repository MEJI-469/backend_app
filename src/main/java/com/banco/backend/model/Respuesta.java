package com.banco.backend.model;

import com.banco.backend.util.AesEncryptor;
import jakarta.persistence.*;

@Entity
@Table(name = "respuestas")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación con Usuario (muchas respuestas por usuario)
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    // Relación con Pregunta (una pregunta puede tener muchas respuestas)
    @ManyToOne
    @JoinColumn(name = "pregunta_id", nullable = false)
    private Pregunta pregunta;

    @Column(nullable = false)
    private String respuestaEncriptada;

    public Respuesta() {}

    public Respuesta(Long id, Usuario usuario, Pregunta pregunta, String respuestaEncriptada) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.pregunta = pregunta;
		this.respuestaEncriptada = respuestaEncriptada;
	}

	public void setRespuesta(String respuestaPlano) {
        this.respuestaEncriptada = AesEncryptor.encrypt(respuestaPlano);
    }

    public String getRespuesta() {
        return AesEncryptor.decrypt(this.respuestaEncriptada);
    }
    
 // ❗ Estos dos son necesarios para tu código
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    // Getters y setters restantes
}
