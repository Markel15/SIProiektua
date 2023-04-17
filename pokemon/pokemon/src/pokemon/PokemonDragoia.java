package pokemon;

public class PokemonDragoia extends Pokemon {
	public PokemonDragoia(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Dragoia");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Dragoia"))return 2;
		else return 1;
	}
}
