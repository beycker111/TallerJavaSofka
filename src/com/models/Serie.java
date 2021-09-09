package com.models;

public class Serie implements Entregable {

    public static final int NUM_TEMPORADAS_POR_DEFECTO = 3;

    private String titulo;
    private String creador;
    private int numeroTemporadas;
    private boolean prestado;
    private String genero;


    public Serie(){
        this.titulo = "";
        this.creador = "";
        this.numeroTemporadas = NUM_TEMPORADAS_POR_DEFECTO;
        this.prestado = false;
        this.genero = "";
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = NUM_TEMPORADAS_POR_DEFECTO;
        this.prestado = false;
        this.genero = "";
    }

    public Serie(String titulo, String creador, int numeroTemporadas, String genero){
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
        this.prestado = false;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", creador='" + creador + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", prestado=" + prestado +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean isEntregado() {
        return prestado;
    }

    @Override
    public int compareTo(Object obj) {
        Serie serieAComparar = (Serie)obj;
        int result = -2;

        if(this.numeroTemporadas > serieAComparar.numeroTemporadas)
            result = 1;
        else if(this.numeroTemporadas == serieAComparar.numeroTemporadas)
            result = 0;
        else if(this.numeroTemporadas < serieAComparar.numeroTemporadas)
            result = -1;

        return result;

    }
}
