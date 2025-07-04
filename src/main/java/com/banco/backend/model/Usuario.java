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
    
    @Column(name = "tipo_cliente")
    private String tipoCliente;

    @Column(name = "tipo_cuenta")
    private String tipoCuenta;

    @Column(name = "numero_cuenta")
    private String numeroCuenta;

    @Column(name = "saldo_disponible")
    private String saldoDisponible;

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
    
    public void setTipoClientePlano(String tipoClientePlano) {
        this.tipoCliente = AesEncryptor.encrypt(tipoClientePlano);
    }

    public String getTipoClientePlano() {
        return AesEncryptor.decrypt(this.tipoCliente);
    }

    public void setTipoCuentaPlano(String tipoCuentaPlano) {
        this.tipoCuenta = AesEncryptor.encrypt(tipoCuentaPlano);
    }

    public String getTipoCuentaPlano() {
        return AesEncryptor.decrypt(this.tipoCuenta);
    }

    public void setNumeroCuentaPlano(String numeroCuentaPlano) {
        this.numeroCuenta = AesEncryptor.encrypt(numeroCuentaPlano);
    }

    public String getNumeroCuentaPlano() {
        return AesEncryptor.decrypt(this.numeroCuenta);
    }

    public void setSaldoDisponiblePlano(String saldoPlano) {
        this.saldoDisponible = AesEncryptor.encrypt(saldoPlano);
    }

    public String getSaldoDisponiblePlano() {
        return AesEncryptor.decrypt(this.saldoDisponible);
    }

    // Getters, setters y constructores...
    public Usuario() {}
    
	public Usuario(Long id, String username, String password, String tipoCliente, String tipoCuenta,
			String numeroCuenta, String saldoDisponible, List<Respuesta> respuestas, ImagenSeguridad imagenSeguridad) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.tipoCliente = tipoCliente;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.saldoDisponible = saldoDisponible;
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

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(String saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	
}
