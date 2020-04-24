package app;

import java.util.ArrayList;
import java.util.List;

import armas.ArcoyFlecha;
import armas.Arma;
import personajes.Criatura;
import personajes.Elfo;
import personajes.Enano;
import personajes.Goblin;
import personajes.Hobbit;
import personajes.Humano;
import personajes.Orco;
import personajes.Personaje;
import personajes.Trol;
import personajes.Wizard;
import reliquias.AnillodeElfo;
import reliquias.ChalecoMithril;
import reliquias.Reliquia;
import armas.Espada;
import armas.HachaDoble;
import armas.Baculo;

public class LOTR {

    public List<Personaje> personajes = new ArrayList<>();
    /*public List<Enano> enanos = new ArrayList<>();
    public List<Goblin> goblins = new ArrayList<>();
    public List<Hobbit> hobbits = new ArrayList<>();
    public List<Humano> humanos = new ArrayList<>();
    public List<Wizard> wizards = new ArrayList<>();
    public List<Orco> orcos = new ArrayList<>();
    public List<Trol> trols = new ArrayList<>();
     */
    public List<Arma> armas = new ArrayList<>();
    public List<Reliquia> reliquias = new ArrayList<>();
   

    public void inicializarCatalogoPersonajes() {
        Elfo elfo = new Elfo();
        elfo.nombre = "Legolast";
        elfo.salud = 100;
        elfo.stamina = 50;
        elfo.energiaMagica = 100;
        ArcoyFlecha arcoyFlecha = new ArcoyFlecha();
        elfo.armas.add(arcoyFlecha);
        Espada espada = new Espada();
        elfo.armas.add (espada);
        elfo.setReliquia (new AnillodeElfo());
        personajes.add(elfo);




        Enano enano = new Enano();
        enano.nombre = "Gimli";
        enano.salud = 100;
        enano.stamina = 100;
        HachaDoble hachaDoble = new HachaDoble();
        enano.armas.add(hachaDoble);
        espada = new Espada();
        enano.armas.add (espada);
        personajes.add(enano);
        enano.setReliquia (new ChalecoMithril());



        Hobbit hobbit = new Hobbit();
        hobbit.nombre = "Frodo";
        hobbit.salud = 100;
        hobbit.stamina = 100;
        HachaDoble hachaDoble = new HachaDoble();
        hobbit.armas.add(hachaDoble);
        Baculo baculo = new Baculo();
        hobbit.armas.add (baculo);
        personajes.add(hobbit);
        hobbit.setReliquia (new Reliquia());





        hobbit = new Hobbit();
        hobbit.nombre = "Sam";
        hobbit = new Hobbit();
        hobbit.nombre = "Peregrim";

        Humano humano = new Humano();
        humano.nombre = "Aragon";

        Wizard wizard = new Wizard();
        wizard.nombre = "Galdalf";
        wizard = new Wizard();
        wizard.nombre = "Saruman";

        Trol trol = new Trol();
        trol.nombre = "Trol 1";

        Orco orco = new Orco();
        orco.nombre = "Orco 1";

        Goblin goblin = new Goblin();
        goblin.nombre = "Goblin 1";
    }

   public Personaje elegiPersonaje(int eleccion){
       return this.personajes.get(eleccion -1);
   }
   

}
