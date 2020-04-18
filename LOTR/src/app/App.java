package app;

import juego.LOTR;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        LOTR miLOTR = new LOTR();

        System.out.println("Iniciando Catalogo");

        miLOTR.inicializarCatalogoPersonajes();


    }
}