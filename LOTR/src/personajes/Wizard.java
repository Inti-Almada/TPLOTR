package personajes;

import app.Ihacemagia;
import armas.Arma;

public class Wizard extends Personaje implements Ihacemagia {

    // Posee la energía máxima que posee el mago. Max 100

    public String nombre;
    public int energiaMagica;
    public int stamina;

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {

       if ( this.getSalud() >= 20 && this.getStamina() <= 10 )
       /* en lugar de getSalud deberia ir getenergiaMagica pero al no haber hecho las reliquias el otro parametro que usaremos para que la condicion se cumpla sera salud en un futuro cuando lo terminemos se cambiara la condicion para que se cumpla el ataque epico*/
            return true; 
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {

            
        personaje.setSalud(personaje.getSalud() - arma.getDanio() * 2);

        this.setStamina(0);

        this.setEnergiaMagica(0);


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

}