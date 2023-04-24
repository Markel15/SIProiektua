package pokemon;

public class PokemonHegalaria extends Pokemon {
	public PokemonHegalaria(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Hegalaria");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Belarra") || pMota.equals("Zomorro") || pMota.equals("Borroka"))return 2;
		//else if(pMota.equals("Elektrikoa") || pMota.equals("Arroka"))return 0.5;
		else return 1;
	}
}
