package pokemon;

import java.util.Observable;
import java.util.Random;

public class Jokalaria extends Observable{
	private PokemonZerrenda pokemonZer;
	private String izena;
	private int id;
	private boolean turnoa;
	
	public Jokalaria(int pKop, int pId) {
		this.pokemonZer = new PokemonZerrenda();
		this.izena="Jokalari"+(pId+1);
		for (int i=0;i<pKop;i++) {
			int mota=new Random().nextInt(4);
			Pokemon pok=PokemonFactory.getPokemonFactory().createPokemon(mota,pId);
			this.pokemonZer.gehituPokemon(pok);
		}
		this.id=pId;
		this.turnoa=false;
	}
	public String getName() {
		return this.izena;
	}
	public void setName(String pIzena) {
		this.izena=pIzena;
	}
	public PokemonZerrenda getPokemonZer() {
		return this.pokemonZer;
	}
	public void erasoEgin() {
		
	}
	public void berriztuPokemonak() {
		this.pokemonZer.berriztu();
	}
	public int getId() {
		return this.id;
	}
	public boolean jokalariDa(int pId) {
		return this.id==pId;
	}
	public Pokemon aurkituPokemonIdz(int pId) {
		return this.pokemonZer.aurkituPokemonIdz(pId);
	}
	public void setTurnoa(boolean b) {
		this.turnoa=b;
		System.out.println(this.getName() + Boolean.toString(b)+ "turnoa da");
		Object[] infoArray= {this.getId(),this.getTurnoa()};
		this.setChanged();
		this.notifyObservers(infoArray);
	}
	public boolean getTurnoa() {
		return this.turnoa;
	}
}
