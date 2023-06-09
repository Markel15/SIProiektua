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
		Jokalaria erasotua=JokalariKatalogoa.getnJK().getJokalariaAusaz(this);
		while (i<this.getPokemonZer().getSize() && !amaitu){
			if(JokalariKatalogoa.getnJK().jokalariAurkituIdz(this.getId()).getPokemonPosizioz(i).bizirikDago()) {
				BurrukaKudeatzailea.getnBK().setErasoPokemon(this.getId(),i);
				if(erasotua.getBizirikDaudenak()==0) amaitu=true;
				else {
					BurrukaKudeatzailea.getnBK().setJasoPokemon(erasotua.getId(),erasotua.getPokemonZer().getBizirikDagoenPosizioa());
					BurrukaKudeatzailea.getnBK().burrukaKudeatu();
				}
			}
			i++;
		}
		if(this.getBizirikDaudenak()<=0) {
			System.out.println(this.getName()+"-ek galdu du");
		}
		else if(erasotua.getBizirikDaudenak()<=0) {
			erasotua.berriztuInfo();
		}
		
	}
}
