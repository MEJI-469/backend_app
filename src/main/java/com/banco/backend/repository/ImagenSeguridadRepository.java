package com.banco.backend.repository;

import com.banco.backend.model.ImagenSeguridad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImagenSeguridadRepository extends JpaRepository<ImagenSeguridad, Long> {
    Optional<ImagenSeguridad> findByNombreImagen(String nombreImagen);
}
