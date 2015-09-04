
public class Vehicule{

	Roue roue;
	
	Carrosserie carroserie;
	
	public Vehicule(Color color) {
		roue = new Roue(color);
		carroserie = new Carrosserie(color);		
	}
	
	
}
