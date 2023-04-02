
import static org.junit.Assert.assertNotNull;

import it.uniroma3.it.diadia.ambienti.Labirinto;
public class labirintoTest {
	

	public class LabirintoTest {
	private Labirinto labirinto;

	@Before
	public void setUp() {
	this. labirinto = new Labirinto();
	}

	@Test
	public void testGetStanzaIniziale() {
	   assertNotNull (this. labirinto.getStanzaIniziale());
	}

	

	@Test
	public void testGetStanzaVincente() {
       assertNotNull(this. labirinto.getStanzaVincente());
	
}
	
}
}