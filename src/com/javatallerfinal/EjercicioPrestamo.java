package com.javatallerfinal;

import com.models.Serie;
import com.models.Videojuego;

public class EjercicioPrestamo {

    private Serie[] arraySerie;
    private Videojuego[] arrayVideojuego;

    public EjercicioPrestamo(){
        arraySerie = new Serie[5];
        arrayVideojuego = new Videojuego[5];
    }

    public void asignarElementosAArreglos(){

        Serie serie1 = new Serie();
        Serie serie2 = new Serie();
        //Serie serie3 = new Serie("Riverdale", "Veronica Lodge");
        Serie serie3 = new Serie("Guerras", "Manuel", 40, "Terror");
        Serie serie4 = new Serie("Elite", "Beycker");
        Serie serie5 = new Serie("Dark", "Lalo", 40, "Terror");

        Videojuego videojuego1 = new Videojuego();
        Videojuego videojuego2 = new Videojuego();
        Videojuego videojuego3 = new Videojuego("Zelda", 65);
        Videojuego videojuego4 = new Videojuego("Digimon", 30);
        Videojuego videojuego5 = new Videojuego("Yugioh", 45, "Accion", "Konami");

        arraySerie[0] = serie1;
        arraySerie[1] = serie2;
        arraySerie[2] = serie3;
        arraySerie[3] = serie4;
        arraySerie[4] = serie5;

        arrayVideojuego[0] = videojuego1;
        arrayVideojuego[1] = videojuego2;
        arrayVideojuego[2] = videojuego3;
        arrayVideojuego[3] = videojuego4;
        arrayVideojuego[4] = videojuego5;
    }

    public void entregarAlgunasSeries(){
        arraySerie[0].entregar();
        arraySerie[2].entregar();
        arraySerie[4].entregar();
    }

    public void entregarAlgunosVideojuegos(){
        arrayVideojuego[1].entregar();
        arrayVideojuego[3].entregar();
    }

    public int contarSeriesPrestadasYDevolver(){
        int contadorSeriesPrestadas = 0;
        for(Serie s:arraySerie){
            if(s.isEntregado())
                contadorSeriesPrestadas++;
                s.devolver();
        }

        return contadorSeriesPrestadas;
    }

    public int contarVideojuegosPrestadosYDevolver(){
        int contadorVideojuegosPrestadas = 0;
        for(Videojuego v:arrayVideojuego){
            if(v.isEntregado())
                contadorVideojuegosPrestadas++;
                v.devolver();
        }

        return contadorVideojuegosPrestadas;
    }

    public Videojuego videojuegoMasHorasEstimadas(){
        Videojuego videojuegoMasHorasEstimadas = arrayVideojuego[0];

        for(int i = 0; i < arrayVideojuego.length - 1; i++){
            if(videojuegoMasHorasEstimadas.compareTo(arrayVideojuego[i+1]) == 1)
                videojuegoMasHorasEstimadas = videojuegoMasHorasEstimadas;
            else
                videojuegoMasHorasEstimadas = arrayVideojuego[i+1];

        }
        return videojuegoMasHorasEstimadas;

    }

    public Serie serieMasTemporadas(){
        Serie serieMasTemporadas = arraySerie[0];

        for(int i = 0; i < arraySerie.length - 1; i++){
            if(serieMasTemporadas.compareTo(arraySerie[i+1]) == 1)
                serieMasTemporadas = serieMasTemporadas;
            else
                serieMasTemporadas = arraySerie[i+1];
        }

        return serieMasTemporadas;
    }
}
