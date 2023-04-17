package pokemon;

public class PokemonBelarra extends Pokemon {
	public PokemonBelarra(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Belarra");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Elektrikoa") || pMota.equals("Ura") || pMota.equals("Arroka"))return 2;
		//else if(pMota.equals("Zomorro") || pMota.equals("Belarra") || pMota.equals("Sua") || pMota.equals("Dragoia") || pMota.equals("Hegalaria"))return 0.5;
		else return 1;
	}
}
