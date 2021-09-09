package com.models;

public class Television extends Electrodomestico{

    public static final float RESOLUCION_POR_DEFECTO = 20;

    private float resolucion;
    private boolean tieneSintonizadorTDT;

    public Television(){
        super();
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.tieneSintonizadorTDT = false;
    }

    public Television(float precio, float peso){
        super(precio, peso);
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.tieneSintonizadorTDT = false;
    }

    public Television(float resolucion, boolean tieneSintonizadorTDT){
        super();
        this.resolucion = resolucion;
        this.tieneSintonizadorTDT = tieneSintonizadorTDT;
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();

        if(this.resolucion > 40)
            precioFinal = (float)(precioFinal*1.3);
        if(this.tieneSintonizadorTDT)
            precioFinal += 50;

        return  precioFinal;
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isTieneSintonizadorTDT() {
        return tieneSintonizadorTDT;
    }
}
