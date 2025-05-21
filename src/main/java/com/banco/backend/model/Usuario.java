package com.banco.backend.model;

import jakarta.persistence.*;

import java.util.List;

import com.banco.backend.util.AesEncryptor;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    // Relación uno-a-muchos: un usuario tiene 5 respuestas
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Respuesta> respuestas;

    // Relación uno-a-uno con ImagenSeguridad
    @OneToOne
    @JoinColumn(name = "imagen_id", nullable = false)
    private ImagenSeguridad imagenSeguridad;
    
    public void setUsernamePlano(String usernamePlano) {
        this.username = AesEncryptor.encrypt(usernamePlano);
    }

    public String getUsernamePlano() {
        return AesEncryptor.decrypt(this.username);
    }
    
    public void setPasswordPlano(String passwordPlano) {
        this.password = AesEncryptor.encrypt(passwordPlano);
    }

    public String getPasswordPlano() {
        return AesEncryptor.decrypt(this.password);
    }

    // Getters, setters y constructores...
    public Usuario() {}

	public Usuario(Long id, String username, String password, List<Respuesta> respuestas,
			ImagenSeguridad imagenSeguridad) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.respuestas = respuestas;
		this.imagenSeguridad = imagenSeguridad;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public ImagenSeguridad getImagenSeguridad() {
		return imagenSeguridad;
	}

	public void setImagenSeguridad(ImagenSeguridad imagenSeguridad) {
		this.imagenSeguridad = imagenSeguridad;
	}

}
