package app;

import personajes.Wizard;
import armas.Arma;
import personajes.Elfo;

public interface Ihacemagia {

//Devuelve energía mágica del implementador. 

    int getEnergiaMagica(); 
    void setEnergiaMagica(int energiaMagica); 
    boolean puedoEjecutarAtaqueEpico();
    void ataqueEpico(Elfo elfo, Wizard wizard, Arma arma);

    

    

}