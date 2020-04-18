package personajes;

public class Wizard extends Personaje {

    //Posee la energía máxima que posee el mago. Max 100

    public static String nombre;
	private int energiaMagica;

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }
    

}