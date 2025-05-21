package com.banco.backend.model;

import com.banco.backend.util.AesEncryptor;
import jakarta.persistence.*;

@Entity
@Table(name = "imagenes_seguridad")
public class ImagenSeguridad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_imagen", nullable = false)
    private String nombreImagen; // este será el campo cifrado en BD

    public ImagenSeguridad() {}

    public ImagenSeguridad(Long id, String nombreImagenPlano) {
        this.id = id;
        this.setNombreImagenPlano(nombreImagenPlano);
    }

    // Setter con encriptación
    public void setNombreImagenPlano(String nombreImagenPlano) {
        this.nombreImagen = AesEncryptor.encrypt(nombreImagenPlano);
    }

    // Getter con desencriptación
    public String getNombreImagenPlano() {
        return AesEncryptor.decrypt(this.nombreImagen);
    }

    // Getter y setter base (opcional si aún se usa internamente)
    public Long getId() {
        return id;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }
}
