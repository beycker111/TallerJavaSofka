package com.javatallerfinal;

import com.models.Electrodomestico;
import com.models.Lavadora;
import com.models.Television;

import java.util.ArrayList;

public class EjercicioElectrodomestico {

    ArrayList<Electrodomestico> electrodomesticos;

    public EjercicioElectrodomestico(){
        electrodomesticos = new ArrayList<>();
    }

    public void asignarElectrodomesticosAArreglo(){

        Electrodomestico electrodomestico1 = new Electrodomestico();
        Electrodomestico electrodomestico2 = new Electrodomestico(180, 10);
        Electrodomestico electrodomestico3 = new Electrodomestico(200, 20, Electrodomestico.NEGRO, Electrodomestico.B);
        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora(135, 7);
        Lavadora lavadora3 = new Lavadora(105);
        Television television1 = new Television();
        Television television2 = new Television(90, 30);
        Television television3 = new Television(23, true);
        Television television4 = new Television(87, true);

        electrodomesticos.add(electrodomestico1);
        electrodomesticos.add(electrodomestico2);
        electrodomesticos.add(electrodomestico3);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora3);
        electrodomesticos.add(television1);
        electrodomesticos.add(television2);
        electrodomesticos.add(television3);
        electrodomesticos.add(television4);

    }

    public void calcularPrecioElectrodomesticos(){

        float precioElectrodomesticos = 0;
        float precioLavadoras = 0;
        float precioTelevisores = 0;

        for(int i = electrodomesticos.size() -1; i >= 0; i--){
            if(electrodomesticos.get(i) instanceof Television){
                System.out.println("Precio del televisor en el índice: " + i + " " + electrodomesticos.get(i).precioFinal());
                precioTelevisores += electrodomesticos.get(i).precioFinal();
            }else if (electrodomesticos.get(i) instanceof Lavadora){
                System.out.println("Precio de la lavadora en el índice: " + i + " " + electrodomesticos.get(i).precioFinal());
                precioLavadoras += electrodomesticos.get(i).precioFinal();
            }else{
                System.out.println("Precio del electrodomestico en el índice: " + i + " " + electrodomesticos.get(i).precioFinal());
                precioElectrodomesticos += electrodomesticos.get(i).precioFinal();
            }

        }

        System.out.println("Precio televisores: " + precioTelevisores);
        System.out.println("Precio lavadoras: " + precioLavadoras);
        System.out.println("Precio electrodomesticos: " + (precioTelevisores + precioLavadoras + precioElectrodomesticos));
    }
}
