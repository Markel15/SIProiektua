package pokemon;

public class PokemonSua extends Pokemon {
	public PokemonSua(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Sua");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Belarra") || pMota.equals("Zomorro"))return 2;
		//else if(pMota.equals("Ura") || pMota.equals("Arroka") || pMota.equals("Sua") || pMota.equals("Dragoia"))return 0.5;
		else return 1;
	}
}
