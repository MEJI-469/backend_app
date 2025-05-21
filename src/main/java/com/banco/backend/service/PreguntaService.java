package com.banco.backend.service;

import com.banco.backend.model.Pregunta;
import com.banco.backend.repository.PreguntaRepository;
import org.springframework.stereotype.Service;

@Service
public class PreguntaService {

    private final PreguntaRepository preguntaRepository;

    public PreguntaService(PreguntaRepository preguntaRepository) {
        this.preguntaRepository = preguntaRepository;
    }

    public Pregunta findById(Long id) {
        return preguntaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Pregunta no encontrada con id " + id));
    }
}
