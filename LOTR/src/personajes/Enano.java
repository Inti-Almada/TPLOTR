package personajes;

import app.Illevareliquia;
import reliquias.Reliquia;

public class Enano extends Criatura implements Illevareliquia{

	private Reliquia reliquia;

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }



}