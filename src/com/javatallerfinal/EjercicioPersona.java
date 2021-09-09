package com.javatallerfinal;

import com.models.Persona;

import java.util.Scanner;

public class EjercicioPersona {

    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);

        boolean isOk = false;
        while (!isOk){
            System.out.println("Ingrese el nombre de la persona");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona");
            String edad = scanner.nextLine();
            if(!edad.matches("-?\\d+")){
                System.out.println("La edad debe ser un valor entero");
                continue;
            }
            System.out.println("Ingrese el sexo de la persona (H para Hombre o M para mujer)");
            String sexo = scanner.nextLine();
            System.out.println("Ingrese el peso de la persona en kilos (Si es decimal usar el punto (.))");
            String peso = scanner.nextLine();
            if(!peso.matches("[+-]?\\d*(\\.\\d+)?")){
                System.out.println("El peso debe ser un valor númerico");
                continue;
            }
            System.out.println("Ingrese la altura de la persona en centimetros (cm)");
            String altura = scanner.nextLine();
            if(!altura.matches("-?\\d+")){
                System.out.println("La altura debe darse en centimetros (cm)");
                continue;
            }

            isOk = true;
            crearPersona(nombre, Integer.parseInt(edad), sexo, Float.parseFloat(peso), Integer.parseInt(altura));
        }

    }

    public void crearPersona(String nombre, int edad, String sexo, float peso, int altura){

        float alturaEnMetros = ((float)altura)/100;

        Persona personaAll = new Persona(nombre, edad, sexo, peso, alturaEnMetros);
        Persona personaSome = new Persona(nombre, edad, sexo);
        Persona personaNothing = new Persona();

        personaSome.setPeso(peso);
        personaSome.setAltura(alturaEnMetros);

        personaNothing.setNombre(nombre);
        personaNothing.setEdad(edad);
        personaNothing.setSexo(sexo);
        personaNothing.setPeso(peso);
        personaNothing.setAltura(alturaEnMetros);

        System.out.println("Información para la persona instanciada con el constructor de todos los parametros");
        comprobarValores(personaAll);
        System.out.println("Información para la persona instanciada con el constructor sin peso ni altura");
        comprobarValores(personaSome);
        System.out.println("Información para la persona instanciada con el constructor por defecto (sin parametros)");
        comprobarValores(personaNothing);
    }

    public void comprobarValores(Persona persona){
        if(persona.calcularIMC() == Persona.BAJO_PESO)
            System.out.println("Esta por debajo de lo normal");
        else if(persona.calcularIMC() == Persona.PESO_IDEAL)
            System.out.println("Esta en el peso ideal");
        else if(persona.calcularIMC() == Persona.SOBRE_PESO)
            System.out.println("Esta con sobrepeso");

        if(persona.esMayorDeEdad())
            System.out.println("Es mayor de edad");
        else
            System.out.println("No es mayor de edad");

        System.out.println(persona);
    }
}
