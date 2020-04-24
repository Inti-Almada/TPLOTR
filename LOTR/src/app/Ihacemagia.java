package app;

import personajes.Personaje;

public interface Ihacemagia {

//Devuelve energía mágica del implementador. 

    int getEnergiaMagica(); 
    void setEnergiaMagica(int energiaMagica); 
    boolean puedoEjecutarAtaqueEpico();
    void ataqueEpico(Personaje personaje, Arma arma);

    

    

}