package pokemon;
import java.util.Random;

public class Bot extends Jokalaria{
	public Bot(int pPok,int pId) {
		super(pPok,pId);
		super.setName("Bot"+pId);
	}
	@Override
	public void erasoEgin() {
		Random rand = new Random();
		for (int i=0; i<this.getPokemonZer().getSize();i++){
			Pokemon pok=this.getPokemonZer().getPokemon_I(i);
			BurrukaKudeatzailea.getnBK().setErasoPokemon(pok);
			Jokalaria erasotua=JokalariKatalogoa.getnJK().getJokalariaAusaz(this);
			BurrukaKudeatzailea.getnBK().setJasoPokemon(erasotua.getPokemonZer().getPokemon_I(rand.nextInt(erasotua.getPokemonZer().getSize())));
			BurrukaKudeatzailea.getnBK().burrukaKudeatu();
		}
		Nagusia.getNagusia().hasi();
	}
}
