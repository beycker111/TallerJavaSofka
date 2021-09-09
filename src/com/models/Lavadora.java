package com.models;

public class Lavadora extends Electrodomestico{

    public static final float CARGA_POR_DEFECTO = 5;

    private float carga;

    public Lavadora(){
        super();
        this.carga = CARGA_POR_DEFECTO;
    }

    public Lavadora(float precio, float peso){
        super(precio, peso);
        this.carga = CARGA_POR_DEFECTO;
    }

    public Lavadora(float carga){
        super();
        this.carga = carga;
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();

        if(this.carga > 30){
            precioFinal += 50;
        }

        return precioFinal;
    }

    public float getCarga() {
        return carga;
    }
}
