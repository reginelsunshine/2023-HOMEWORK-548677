package it.uniroma3.it.diadia.ambienti;

public class stanzaBuia extends Stanza {
	
	private  String lampada;

	public stanzaBuia(String nome) {
		super(nome);
		this.lampada = lampada;
	}

	

	@Override
	public String getDescrizione() {
		String buio = new String();
		buio = "qui c'è troppo buio";
		if(!this.hasAttrezzo(lampada))
			return buio;
		return super.getDescrizione();
	}
}
