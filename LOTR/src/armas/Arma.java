package armas;

public class Arma {

    //Valor de daño que hace al oponente.
    //Valor de stamina que debe decrementar al atacante.

    private String nombre;
    private int danio;
    private int stamina;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    



}