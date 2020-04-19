package app;

import personajes.Personaje;

public class Players extends Personaje {

    
    public void atacar(Players p1, Players p2, int danio){
    p2.salud -= danio;

}

}
