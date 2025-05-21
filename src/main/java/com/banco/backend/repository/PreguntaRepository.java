package com.banco.backend.repository;

import com.banco.backend.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    Optional<Pregunta> findByTexto(String texto);
}
