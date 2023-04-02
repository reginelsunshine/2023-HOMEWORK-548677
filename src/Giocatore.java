import it.uniroma3.diadia.giocatore.Borsa;

public class Giocatore {
	private Borsa borsa;
	static final private int CFU_INIZIALI = 20;
	private int cfu;
	
	public Giocatore() {
		this.cfu=CFU_INIZIALI;
		this.borsa=new Borsa();
	}
	public Borsa getBorsa() {
		return borsa;
	}
	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}
	public int getCfu() {
		return cfu;
	}
	public void setCfu(int cfu) {
		this.cfu = cfu;
	}
	
	
}
