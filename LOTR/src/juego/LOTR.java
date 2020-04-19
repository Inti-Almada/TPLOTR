package juego;

import java.util.ArrayList;
import java.util.List;

import armas.Arma;
import personajes.Elfo;
import personajes.Enano;
import personajes.Goblin;
import personajes.Hobbit;
import personajes.Humano;
import personajes.Orco;
import personajes.Trol;
import personajes.Wizard;
import reliquias.Reliquia;

public class LOTR {

    public List<Elfo> elfos = new ArrayList<>();
    public List<Enano> enanos = new ArrayList<>();
    public List<Goblin> goblins = new ArrayList<>();
    public List<Hobbit> hobbits = new ArrayList<>();
    public List<Humano> humanos = new ArrayList<>();
    public List<Wizard> wizards = new ArrayList<>();
    public List<Orco> orcos = new ArrayList<>();
    public List<Trol> trols = new ArrayList<>();
    public List<Arma> armas = new ArrayList<>();
    public List<Reliquia> reliquias = new ArrayList<>();

    public void inicializarCatalogoPersonajes(){
        final Elfo elfo = new Elfo();
        Elfo.nombre = "Legolast";

        final Enano enano = new Enano();
        Enano.nombre = "Gimli";

        Hobbit hobbit = new Hobbit();
        Hobbit.nombre = "Frodo";
        hobbit = new Hobbit();
        Hobbit.nombre = "Sam";
        hobbit = new Hobbit();
        Hobbit.nombre = "Peregrim";

        final Humano humano = new Humano();
        Humano.nombre = "Aragon";

        Wizard wizard = new Wizard();
        Wizard.nombre = "Galdalf";
        wizard = new Wizard();
        Wizard.nombre = "Saruman";

        final Trol trol = new Trol();
        Trol.nombre = "Trol 1";
        
        final Orco orco = new Orco();
        Orco.nombre = "Orco 1";

        final Goblin goblin = new Goblin();
        Goblin.nombre = "Goblin 1";
    }

        public void inicializarCatalogoArmas(){
                
     

}
