package app;

import juego.LOTR;
import juego.players;

public class App{
    public static void main(String[] args) throws Exception {

       


        System.out.println();

        LOTR miLOTR = new LOTR();

        System.out.println("Iniciando Catalogo");

        miLOTR.inicializarCatalogoPersonajes();

        Players p1 = new Players();

        p1.nombre = "Legolas";
        p1.salud = 100;


        Player p2 = new Players();

        p2.nombre = "Aragon";
        p2.salud = 100;
           

        boolean turnop1 = true;

        System.out.println("¡Ataque!");

    

        

        while (p1.getSalud () > 0 && p2.getSalud() > 0) {
       

    }
    
    }
}