package com.javatallerfinal;

import java.util.Scanner;

public class MenuPrincipal {

    public static void menu(){
        System.out.println("**********EJERCICIOS PRÁCTICOS J1AVA************");
        System.out.println("1 - Ejercicio 1 \n2 - Ejercicio 2 \n3 - Ejercicio 3 \n4 - Ejercicio 4");
        System.out.println("5 - Ejercicio 5 \n6 - Ejercicio 6 \n7 - Ejercicio 7 \n8 - Ejercicio 8");
        System.out.println("9 - Ejercicio 9 \n10 - Ejercicio 10 \n11 - Ejercicio 11 \n12 - Ejercicio 12");
        System.out.println("13 - Ejercicio 13 \n14 - Ejercicio 14 \n15 - Ejercicio 15 \n16 - Ejercicio 16");
        System.out.println("17 - Ejercicio 17 \n18 - Ejercicio 18 \n19 - SALIR");
        System.out.println("Digite el número correspondiente del ejercicio");
    }
    public static double leerUnValorDouble(Scanner teclado){

        System.out.println("Por favor ingresa el valor");
        double numero = teclado.nextDouble();
        return numero;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        Ejercicio ejercicio = new Ejercicio();

        boolean entrar = true;

        while (entrar){
            menu();
            int opcion = myObj.nextInt();
            if(opcion > 0 && opcion < 20){
                switch (opcion){
                    case 1:
                        System.out.println(ejercicio.compararDosNumerosAleatorios());
                        break;
                    case 2:
                        double a = leerUnValorDouble(myObj);
                        double b = leerUnValorDouble(myObj);
                        System.out.println(ejercicio.compararDosNumerosPorConsola(a,b));
                        break;
                    case 3:
                        double radio = leerUnValorDouble(myObj);
                        System.out.println("El area del circulo es: " + ejercicio.calcularAreaDeCirculo(radio));
                        break;
                    case 4:
                        double precio = leerUnValorDouble(myObj);
                        System.out.println("El precio del producto con IVA es: " + ejercicio.calcularIVAProducto(precio));
                        break;
                    case  5:
                        ejercicio.mostrarNumerosParesEImparesDel1Al100();
                        break;
                    case 19:
                        entrar = false;
                        break;
                }
            }

        }
    }
}
