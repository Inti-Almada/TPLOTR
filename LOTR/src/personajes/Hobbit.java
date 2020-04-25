package personajes;

import app.Illevareliquia;
import reliquias.Reliquia;

public class Hobbit extends Criatura  implements Illevareliquia{

    //Reliquia que porta el hobbit

    public String nombre;
	public static Reliquia reliquia;
	public Object reliquias;

    @Override
    public Reliquia getReliquia() {
        
        return null;
    }

    @Override
    public void setReliquia(Reliquia reliquia) {
        

    }



}