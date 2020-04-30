package personajes;

import app.Ihacemagia;
import armas.Arma;

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

        if (this.getStamina() <= 10 && this.getEnergiaMagica() > 5)
            return true;
        return false;
    }

    @Override
    public void ataqueEpico(Personaje pdersonaje, Arma arma) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}