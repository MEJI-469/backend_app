package com.banco.backend.dto;

import java.util.List;

public class UsuarioRegistroRequest {

    private String username;
    private String password;
    private String nombreImagen;
    private List<Long> idPreguntas;
    private List<String> respuestas;

    public UsuarioRegistroRequest() {}

    // Getters y setters
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

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public List<Long> getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(List<Long> idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }
}
