package com.javatallerfinal;

import java.util.ArrayList;

public class Ejercicio {

    public static final double IVA = 0.21;

    public String compararDosNumerosAleatorios(){

        int num1 = (int)Math.floor(Math.random()*(10-1+1)+1);
        int num2 = (int)Math.floor(Math.random()*(10-1+1)+1);
        String result = "";
        if(num1 > num2){
            result = "El " + num1 + " es mayor que " + num2;
        }else if(num1 < num2){
            result = "El " + num1 + " es menor que " + num2;
        }else {
            result = "El " + num1 + " es igual que " + num2;
        }
        return result;
    }

    public String compararDosNumerosPorConsola(double num1, double num2){

        String result = "";
        if(num1 > num2){
            result = "El " + num1 + " es mayor que " + num2;
        }else if(num1 < num2){
            result = "El " + num1 + " es menor que " + num2;
        }else {
            result = "El " + num1 + " es igual que " + num2;
        }
        return result;
    }

    public double calcularAreaDeCirculo(double radio){
        return (Math.PI * Math.pow(radio, 2));
    }

    public double calcularIVAProducto(double precio){
        return (precio*(1+IVA));
    }

    public void mostrarNumerosParesEImparesDel1Al100(){

        int i = 1;
        while (i <= 100){
            if(i % 2 == 0){
                //pares.add(i);
                System.out.println(i + " es par");
            }else {
                System.out.println(i + " es impar");
                //impares.add(i);
            }
            i++;
        }

    }
}
