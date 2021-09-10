package com.javatallerfinal;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuPrincipal {

    public static void menu(){
        System.out.println("**********EJERCICIOS PRÁCTICOS JAVA************");
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

    public static String leerUnValorString(Scanner teclado){

        System.out.println("Por favor ingresa el texto");
        String cadena = teclado.nextLine();
        return cadena;
    }

    public static void main(String[] args) {

        Scanner myObjNum = new Scanner(System.in);
        Scanner myObjStr = new Scanner(System.in);
        Ejercicio ejercicio = new Ejercicio();
        EjercicioPersona ejercicioPersona = new EjercicioPersona();
        EjercicioElectrodomestico ejercicioElectrodomestico = new EjercicioElectrodomestico();
        EjercicioPrestamo ejercicioPrestamo = new EjercicioPrestamo();

        boolean entrar = true;

        while (entrar){
            menu();
            int opcion = myObjNum.nextInt();
            if(opcion > 0 && opcion < 20){
                switch (opcion){
                    case 1:
                        System.out.println(ejercicio.compararDosNumerosAleatorios());
                        break;
                    case 2:
                        double a = leerUnValorDouble(myObjNum);
                        double b = leerUnValorDouble(myObjNum);
                        System.out.println(ejercicio.compararDosNumerosPorConsola(a,b));
                        break;
                    case 3:
                        double radio = leerUnValorDouble(myObjNum);
                        System.out.println("El area del círculo es: " + ejercicio.calcularAreaDeCirculo(radio));
                        break;
                    case 4:
                        double precio = leerUnValorDouble(myObjNum);
                        System.out.println("El precio del producto con IVA es: " + ejercicio.calcularIVAProducto(precio));
                        break;
                    case  5:
                        ejercicio.mostrarNumerosParesEImparesDel1Al100();
                        break;
                    case 6:
                        ejercicio.mostrarNumerosParesEImparesDel1Al100CicloFor();
                        break;
                    case 7:
                        ejercicio.comprobarNumeroMayorQueCero();
                        break;
                    case 8:
                        String dia = leerUnValorString(myObjStr);
                        System.out.println(ejercicio.comprobarDiaLaboral(dia));
                        break;
                    case 9:
                        ejercicio.remplazarYConcatenar();
                        break;
                    case 10:
                        String frase = leerUnValorString(myObjStr);
                        System.out.println(ejercicio.eliminarEspaciosDeFrase(frase));
                        break;
                    case 11:
                        String frase2 = leerUnValorString(myObjStr);
                        ejercicio.longitudCadenaYContarVocales(frase2);
                        break;
                    case 12:
                        String palabra1 = leerUnValorString(myObjStr);
                        String palabra2 = leerUnValorString(myObjStr);
                        System.out.println(ejercicio.compararDosPalabras(palabra1, palabra2));
                        break;
                    case 13:
                        System.out.println(ejercicio.fechaYHoraActual());
                        break;
                    case 14:
                        int inicio = (int)leerUnValorDouble(myObjNum);
                        ejercicio.numerosHastaMilDeDosEnDos(inicio);
                        break;
                    case 15:
                        ejercicio.IterarMenuGestionCinematografica();
                        break;
                    case 16:
                        ejercicioPersona.pedirDatos();
                        break;
                    case 17:
                        ejercicioElectrodomestico.asignarElectrodomesticosAArreglo();
                        ejercicioElectrodomestico.calcularPrecioElectrodomesticos();
                        break;
                    case 18:
                        ejercicioPrestamo.asignarElementosAArreglos();
                        ejercicioPrestamo.entregarAlgunasSeries();
                        ejercicioPrestamo.entregarAlgunosVideojuegos();
                        System.out.println("Cantidad de series prestadas: " + ejercicioPrestamo.contarSeriesPrestadasYDevolver());
                        System.out.println("Cantidad de videojuegos prestados: " + ejercicioPrestamo.contarVideojuegosPrestadosYDevolver());
                        System.out.println("Serie con más temporadas:");
                        System.out.println(ejercicioPrestamo.serieMasTemporadas());
                        System.out.println("Videojuego con más horas estimadas:");
                        System.out.println(ejercicioPrestamo.videojuegoMasHorasEstimadas());
                        break;
                    case 19:
                        entrar = false;
                        break;
                }
            }

        }
    }
}
