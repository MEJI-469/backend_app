package com.banco.backend.model;

import com.banco.backend.util.AesEncryptor;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String texto;
    
    public void setTextoPlano(String texto) {
        this.texto = AesEncryptor.encrypt(texto);
    }

    public String getTextoPlano() {
        return AesEncryptor.decrypt(this.texto);
    }

    public Pregunta() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

    // Getters y setters
}
