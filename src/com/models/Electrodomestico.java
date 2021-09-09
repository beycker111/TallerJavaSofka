package com.models;

public class Electrodomestico {

    public static final String BLANCO = "BLANCO";
    public static final String NEGRO = "NEGRO";
    public static final String ROJO = "ROJO";
    public static final String AZUL = "AZUL";
    public static final String GRIS = "GRIS";

    public static final char A = 'A';
    public static final char B = 'B';
    public static final char C = 'C';
    public static final char D = 'D';
    public static final char E = 'E';
    public static final char F = 'F';

    public static final int PRECIO_BASE_POR_DEFECTO = 100;
    public static final float PESO_POR_DEFECTO = 5;

    private float precioBase;
    private float peso;
    private String color;
    private char consumoEnergetico;


    public Electrodomestico(){
        this.precioBase = PRECIO_BASE_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
        this.color = BLANCO;
        this.consumoEnergetico = F;
    }

    public Electrodomestico(float precioBase, float peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = BLANCO;
        this.consumoEnergetico = F;
    }

    public Electrodomestico(float precioBase, float peso, String color, char consumoEnergetico){
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    private char comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico != A && consumoEnergetico != B && consumoEnergetico != C
            && consumoEnergetico != D && consumoEnergetico != E && consumoEnergetico != F)
            return F;
        else
            return consumoEnergetico;
    }

    private String comprobarColor(String color){
        if(color != BLANCO && color != NEGRO && color != ROJO
                && color != AZUL && color != GRIS)
            return BLANCO;
        else
            return color;
    }

    public float precioFinal(){
        float precioFinal = precioBase;

        switch (this.consumoEnergetico){
            case A:
                precioFinal += 100;
                break;
            case B:
                precioFinal += 80;
                break;
            case C:
                precioFinal += 60;
                break;
            case D:
                precioFinal += 50;
                break;
            case E:
                precioFinal += 30;
                break;
            case F:
                precioFinal += 10;
                break;
        }

        if(this.peso >= 0 && this.peso <= 19)
            precioFinal += 10;
        else if(this.peso >= 20 && this.peso <= 49)
            precioFinal += 50;
        else if(this.peso >= 50 && this.peso <= 79)
            precioFinal += 80;
        else if(this.peso > 80)
            precioFinal += 100;

        return precioFinal;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public float getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
}
