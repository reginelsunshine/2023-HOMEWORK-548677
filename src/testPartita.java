
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.it.diadia.ambienti.Stanza;
public class testPartita {
	
	Stanza s = new Stanza("Stanza");
	Partita p = new Partita();
	
	@Test
	public void testSetStanzaAttuale() {
		p.getLabirinto().setStanzaAttuale(s);
		assertEquals(s, p.getLabirinto().getStanzaAttuale());
	}
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Atrio", p.getLabirinto().getStanzaVincente().getNome());
	}
	

	@Test
	public void testNonVintaInizio() {
		
		assertFalse(this.p.vinta());
	}

}
