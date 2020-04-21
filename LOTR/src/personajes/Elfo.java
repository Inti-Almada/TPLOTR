package personajes;

import reliquias.Reliquia;

public class Elfo extends Criatura {

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

}
