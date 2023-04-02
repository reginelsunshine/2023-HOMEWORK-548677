package it.uniroma3.diadia.giocatore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class borsaTest {
			private Borsa borsa;
			private static final int PESO_MAX_BORSA = 20;
			
			Borsa b = new Borsa();
			Attrezzo spada;
			Attrezzo lancia;

			@Before
			public void setup() {

			this.borsa = new Borsa(PESO_MAX_BORSA) ;
			}
			
			@Test
			public void testAddAttrezzoPesoMinoreDiDieci() {
				assertTrue(b.addAttrezzo(spada));

			}
			
			@Test
			public void testAddAttrezzoPesoMaggioreDiDieci() {
				assertFalse(b.addAttrezzo(lancia));

			}
			
			
}
