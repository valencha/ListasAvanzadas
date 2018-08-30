package com.example.estudiante.listasavanzadas;

public class Noticia {

    private String titulo;
    private String descripción;

    //private String urlImg

    private String fecha;


    public Noticia(String titulo, String descripción, String fecha) {
        this.titulo = titulo;
        this.descripción = descripción;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
