package it.uniroma3.it.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.Attrezzo;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;
public class stanzaBuiaTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetDescrizioneConAttrezzo() {
		stanza.addAttrezzo(lampada);
		assertEquals(stanza.toString(), stanza.getDescrizione());
	}
}
