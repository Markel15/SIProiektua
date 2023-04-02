package pokemon;
import java.util.Random;

public class Bot extends Jokalaria{
	private int kont=1;
	
	public Bot(int pPok,int pId) {
		super(pPok,pId);
		super.setName("Bot"+pId);
	}
	@Override
	public void erasoEgin() {
		Random rand = new Random();
		int i=0;
		boolean amaitu=false;
		while (i<this.getBizirikDaudenak().getSize() && !amaitu){
			Pokemon pok=this.getBizirikDaudenak().getPokemonAusaz();
			BurrukaKudeatzailea.getnBK().setErasoPokemon(pok);
			Jokalaria erasotua=JokalariKatalogoa.getnJK().getJokalariaAusaz(this);
			if(erasotua.getBizirikDaudenak().getSize()==0) amaitu=true;
			else {
				BurrukaKudeatzailea.getnBK().setJasoPokemon(erasotua.getBizirikDaudenak().getPokemon_I(rand.nextInt(erasotua.getBizirikDaudenak().getSize())));
				BurrukaKudeatzailea.getnBK().burrukaKudeatu();
				i++;
			}
		}
		if(this.getBizirikDaudenak().getSize()<=0) {
			this.setGaldu(); 
			System.out.println(this.getName()+"-ek galdu du");
			Nagusia.getNagusia().amaitu();
		}
		
	}
}
