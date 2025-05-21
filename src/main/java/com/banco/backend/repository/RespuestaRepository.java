package com.banco.backend.repository;

import com.banco.backend.model.Respuesta;
import com.banco.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    List<Respuesta> findByUsuario(Usuario usuario);
}
