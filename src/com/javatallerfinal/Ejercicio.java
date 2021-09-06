package com.javatallerfinal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio {

    public static final double IVA = 0.21;
    public static final String FRASE = "La sonrisa sera la mejor arma contra la tristeza";

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
                System.out.println(i + " es par");
            }else {
                System.out.println(i + " es impar");
            }
            i++;
        }
    }

    public void mostrarNumerosParesEImparesDel1Al100CicloFor(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i + " es par");
            }else {
                System.out.println(i + " es impar");
            }
        }
    }

    public void comprobarNumeroMayorQueCero(){

        double numero = -1;

        do {
            System.out.println("Ingrese el número");
            Scanner scanner = new Scanner(System.in);
            numero = scanner.nextDouble();

            System.out.println("El número fue: " + numero);
        }while(numero < 0);

    }

    public String comprobarDiaLaboral(String dia){

        String diaMinuscula = dia.toLowerCase();
        String result = "";

        System.out.println("Ingrese el día de la semana sin acentos");

        switch (diaMinuscula){
            case "lunes":
                result = "Es un día laboral";
                break;
            case "martes":
                result = "Es un día laboral";
                break;
            case "miercoles":
                result = "Es un día laboral";
                break;
            case "jueves":
                result = "Es un día laboral";
                break;
            case "viernes":
                result = "Es un día laboral";
                break;
            case "sabado":
                result = "No es un día laboral";
                break;
            case "domingo":
                result = "No es un día laboral";
                break;
            default:
                result = "No es un día valido, recuerde omitir los acentos";
                break;
        }

        return result;
    }

    public void remplazarYConcatenar(){

        String fraseModificada = FRASE.replace("a", "e");
        System.out.println(fraseModificada);

        System.out.println("Ingrese la frase que quiera concatenar a la frase anterior");
        Scanner scanner = new Scanner(System.in);
        String nuevaFrase = scanner.nextLine();

        System.out.println(fraseModificada + " " + nuevaFrase);
    }

    public String eliminarEspaciosDeFrase(String frase){
        String fraseSinEspacios = frase.replace(" ", "");
        return fraseSinEspacios;
    }

    public void longitudCadenaYContarVocales(String frase){

        String fraseMinusculas = frase.toLowerCase();
        System.out.println("La longitud de la cadena es: " + frase.length());

        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        for(int i = 0; i < frase.length(); i++){
            if(fraseMinusculas.charAt(i) == 'a'){
                contadorA++;
            }else if(fraseMinusculas.charAt(i) == 'e'){
                contadorE++;
            }else if(fraseMinusculas.charAt(i) == 'i'){
                contadorI++;
            }else if(fraseMinusculas.charAt(i) == 'o'){
                contadorO++;
            }else if(fraseMinusculas.charAt(i) == 'u'){
                contadorU++;
            }
        }

        System.out.println("Cantidad de A: " + contadorA);
        System.out.println("Cantidad de E: " + contadorE);
        System.out.println("Cantidad de I: " + contadorI);
        System.out.println("Cantidad de O: " + contadorO);
        System.out.println("Cantidad de U: " + contadorU);

    }

    public String compararDosPalabras(String palabra1, String palabra2){

        //En esta preguntar si distingue de mayusculas o minusculas
        String result = "";

        if(palabra1.equals(palabra2)){
            result = "La palabra " + palabra1 + " es igual a " + palabra2;
        }else{
            result = "La palabra " + palabra1 + " no es igual a " + palabra2;
        }

        return result;
    }

    public LocalDateTime fechaYHoraActual(){
        return LocalDateTime.now();
    }

    public void numerosHastaMilDeDosEnDos(int inicio){

        //Validar que inicio sea menor o igual a 1000
        if(inicio < 1000){
            for(int i = inicio;i<=1000;i = i +2){
                System.out.println(i);
            }
        }else{
            System.out.println("El número ingresado debe ser menor a 1000");
        }
    }
}
