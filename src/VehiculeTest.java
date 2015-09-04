import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class VehiculeTest {

	@Test
	public final void testVehicule() {
		Color color = Color.BLEU;
		Vehicule vehicule = new Vehicule(color);
		assertSame(color, vehicule.roue.color);
		assertSame(color, vehicule.carroserie.color);
		
		color = Color.ROUGE;
		vehicule = new Vehicule(color);
		assertSame(color, vehicule.roue.color);
		assertSame(color, vehicule.carroserie.color);
	}
		
}
