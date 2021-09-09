package com.models;

public class Videojuego implements Entregable{

    public static final int HORAS_ESTIMADAS_POR_DEFECTO = 10;

    private String titulo;
    private int horasEstimadas;
    private boolean prestado;
    private String genero;
    private String compania;

    public Videojuego(){
        this.titulo = "";
        this.horasEstimadas = HORAS_ESTIMADAS_POR_DEFECTO;
        this.prestado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.prestado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.prestado = false;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", prestado=" + prestado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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
        return this.prestado;
    }

    @Override
    public int compareTo(Object obj) {
        Videojuego videojuegoAComparar = (Videojuego)obj;
        int result = -2;

        if(this.horasEstimadas > videojuegoAComparar.horasEstimadas)
            result = 1;
        else if(this.horasEstimadas == videojuegoAComparar.horasEstimadas)
            result = 0;
        else if(this.horasEstimadas < videojuegoAComparar.horasEstimadas)
            result = -1;

        return result;
    }
}
