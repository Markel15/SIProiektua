package pokemon;

import java.util.Observable;


public class Nagusia extends Observable{
	
	private static Nagusia nNagusia=null;
	
	private Nagusia() {
	}
	public static Nagusia getNagusia() {
		if(nNagusia==null) {
			nNagusia=new Nagusia();
		}
		return nNagusia;
	}
	public void partidaInizializatu(int pJokalari, int pBot, int pMilisec, int pPok) {
		int jokKont=0;
		for (int i=0;i<pJokalari;i++) {
			Jokalaria jok=new Jokalaria(pPok,i);
			JokalariKatalogoa.getnJK().addJok(jok);
			this.setChanged();
			notifyObservers(jok.getId());
			jokKont++;
		}
		for (int j=0;j<pBot;j++) {
			Bot b=new Bot(pPok,j+jokKont);
			JokalariKatalogoa.getnJK().addJok(b);
			this.setChanged();
			this.notifyObservers(b.getId());
		}
	}
	public void hasi() {
		JokalariKatalogoa.getnJK().jokatu();	
	}
	public void amaitu() {
		System.out.println("Partida amaitu da");
	}

}
