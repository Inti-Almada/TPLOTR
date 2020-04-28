package personajes;

import app.Arma;
import app.Ihacemagia;

public class Wizard extends Personaje implements Ihacemagia {

    // Posee la energía máxima que posee el mago. Max 100

    public String nombre;
    public int energiaMagica;

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
    
        return false;
    }

    @Override
    public void ataqueEpico(Elfo elfo, Wizard wizard, Arma arma) {
    

    }
    

}