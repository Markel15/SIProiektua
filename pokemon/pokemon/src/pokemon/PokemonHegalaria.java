package pokemon;

public class PokemonHegalaria extends Pokemon {
	public PokemonHegalaria(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Hegalaria");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals(" "))return 2;
		else return 1;
	}
}