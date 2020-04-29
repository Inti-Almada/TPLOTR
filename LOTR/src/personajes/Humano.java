package personajes;

import reliquias.Reliquia;

public class Humano extends Personaje {

    //Reliquia que porta el humano

    public String nombre;
	private Reliquia reliquia;

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}