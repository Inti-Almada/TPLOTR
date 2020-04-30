package app;

import personajes.Wizard;
import armas.Arma;
import personajes.Elfo;
import personajes.Personaje;

public interface Ihacemagia {

//Devuelve energía mágica del implementador. 

    int getEnergiaMagica(); 
    void setEnergiaMagica(int energiaMagica); 
    boolean puedoEjecutarAtaqueEpico();
    void ataqueEpico(Personaje personaje, Arma arma);

    

    

}