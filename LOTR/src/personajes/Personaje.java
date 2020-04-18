package personajes;

import java.util.ArrayList;
import java.util.List;
import armas.Arma;

public class Personaje {

    private String nombre;
    private int salud;
    private int stamina;
    private Arma arma;
    public List<Arma> armas = new ArrayList<>();
    public Elfo elfo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

   



    }

    

