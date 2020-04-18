package reliquias;

public class Reliquia {

    //Numero que representa una forma de incremento de daño. De 0 a 1.
    //Numero que representa una forma de decremento de daño recibido. 0 a 1

    private String nombre;
    private double factorDeAtaque;
    private double factorDeDefensa;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFactorDeAtaque() {
        return factorDeAtaque;
    }

    public void setFactorDeAtaque(double factorDeAtaque) {
        this.factorDeAtaque = factorDeAtaque;
    }

    public double getFactorDeDefensa() {
        return factorDeDefensa;
    }

    public void setFactorDeDefensa(double factorDeDefensa) {
        this.factorDeDefensa = factorDeDefensa;
    }

    

}