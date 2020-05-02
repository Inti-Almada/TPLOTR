package app;

import java.util.Scanner;

import armas.Arma;
import personajes.Personaje;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println();

        LOTR miLOTR = new LOTR();

        System.out.println("elige del Catalogo a tu personaje");

        miLOTR.inicializarCatalogoPersonajes();

        System.out.println("Selecciona tu personaje 1");

        System.out.println("**** 01 - Legolast ****");
        System.out.println("**** 02 - Gimli *******");
        System.out.println("**** 03 - Frodo *******");
        System.out.println("**** 04 - Sam *********");
        System.out.println("**** 05 - Peregrim ****");
        System.out.println("**** 06 - Aragon ******");
        System.out.println("**** 07 - Gandalf *****");
        System.out.println("**** 08 - Saruman *****");
        System.out.println("**** 09 - Trol ********");
        System.out.println("**** 10 - Orco ********");
        System.out.println("**** 11 - Goblim ******");

        int p1n;
        p1n = Teclado.nextInt();

        System.out.println("Seleccion personaje 2");

        System.out.println("**** 01 - Legolast ****");
        System.out.println("**** 02 - Gimli *******");
        System.out.println("**** 03 - Frodo *******");
        System.out.println("**** 04 - Sam *********");
        System.out.println("**** 05 - Peregrim ****");
        System.out.println("**** 06 - Aragon ******");
        System.out.println("**** 07 - Gandalf *****");
        System.out.println("**** 08 - Saruman *****");
        System.out.println("**** 09 - Trol ********");
        System.out.println("**** 10 - Orco ********");
        System.out.println("**** 11 - Goblim ******");

        int p2n;
        p2n = Teclado.nextInt();

        Personaje p1 = miLOTR.elegiPersonaje(p1n);
        Personaje p2 = miLOTR.elegiPersonaje(p2n);

        boolean turnop1 = true;

        System.out.println("¡Ataque!");

        boolean p1SinFuerza = false;
        boolean p2SinFuerza = false;

        while ((p1.getSalud() >= 0 && p2.getSalud() >= 0)) {
            Personaje atacante;
            Personaje victima;
            if (turnop1) {
                atacante = p1;
                victima = p2;

            } else {
                atacante = p2;
                victima = p1;

            }

            System.out.println("Personaje " + atacante.getNombre() + " ataca");
            Arma armaelegida = elegirArma(atacante);

            System.out.println(atacante.getNombre() + " eligió " + armaelegida.getNombre());
            boolean fueAtaqueEpico = false;
            

            if (atacante.getStamina() >= armaelegida.getStamina()) {

                if (atacante instanceof Ihacemagia) {

                    Ihacemagia magico = (Ihacemagia) atacante;

                    if (magico.puedoEjecutarAtaqueEpico()) {
                        fueAtaqueEpico = true;
                        magico.ataqueEpico(victima, armaelegida);
                    } else {
                        atacante.atacar(victima, armaelegida);
                    }
                } else
                    atacante.atacar(victima, armaelegida);
                if (fueAtaqueEpico)
                    System.out.println("fue ataque epico");
                System.out.println("Oh no! a " + victima.getNombre() + " le queda " + victima.getSalud()
                        + " puntos de salud " + " y tiene " + victima.getStamina() + " de stamina ");
            } else {
                if (!p1SinFuerza)
                    p1SinFuerza = atacante.equals(p1);
                if (!p2SinFuerza)
                    p2SinFuerza = atacante.equals(p2);

                System.out.println("no puede atacar");

            }
            turnop1 = !turnop1;

            if (p1SinFuerza && p2SinFuerza)
                break;
        }

        if (p1.getSalud() > 0 && p1.getStamina() > 0) {

            System.out.println("Felicitaciones!Ganó personaje 1");
        } else if (p2.getSalud() > 0 && p2.getStamina() > 0) {
            System.out.println("Excelente! Ganó personaje 2");
        } else {
            System.out.println("empate!");
        }

    }

    public static Arma elegirArma(Personaje personaje) {

        System.out.println("Elija el arma 1 o 2 de tu personaje " + personaje.armas);

        int idarma = Teclado.nextInt();

        return personaje.armas.get(idarma - 1);
    }
}
