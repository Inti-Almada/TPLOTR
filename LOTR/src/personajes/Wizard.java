package personajes;

import app.Ihacemagia;

public class Wizard extends Personaje implements Ihacemagia {

    //Posee la energía máxima que posee el mago. Max 100

    public String nombre;
	public int energiaMagica;

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }
    

}