import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


import org.junit.Test;

import it.uniroma3.it.diadia.ambienti.Stanza;



public class testStanza {
	Stanza s1 = new Stanza("s1");
	Stanza s2= new Stanza("s2");
	Stanza s3 = new Stanza("s3");
	
	@Test
	public void testGetStanzaAdiacente() {
		assertNull(s1.getStanzaAdiacente("sud"));
	}
	

	@Test
	public void testImpostaStanzaAdiacente() {
		s1.impostaStanzaAdiacente("sud", s2);
		assertEquals(s2, s1.getStanzaAdiacente("sud"));
	}
	
        @Test
        public void testImpostaStanzaAdiacente2() {
		s2.impostaStanzaAdiacente("sud", s3);
		assertEquals(s3, s2.getStanzaAdiacente("sud"));
	}
}
