package pokemon;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;


public class Nagusia extends Observable{
	
	private static Nagusia nNagusia=null;
	private Timer timer;
	
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
		TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
            	JokalariKatalogoa.getnJK().jokatu();
            }
        };
        (this.timer = new Timer()).scheduleAtFixedRate(timerTask, 0, 2000);	
	}
	public void amaitu() {
		this.timer.cancel();
		this.timer.purge();
	}

}
