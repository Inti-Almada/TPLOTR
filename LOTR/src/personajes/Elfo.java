package personajes;

import reliquias.Reliquia;
import app.Ihacemagia;
import app.Illevareliquia;
import armas.Arma;

public class Elfo extends Criatura implements Ihacemagia, Illevareliquia {

    // Posee la energía máxima que posee el elfo. Max 100

    public int energiaMagica;
    public int stamina;

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    private Reliquia reliquia;

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
    
        return false;
    }

    @Override
    public void ataqueEpico(Elfo elfo, Wizard wizard, Arma arma) {

    }

}
