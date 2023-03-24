package pokemon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class JokalariKatalogoa {
	private ArrayList<Jokalaria> JokalariZer;
	private static JokalariKatalogoa nJK;
	
	private JokalariKatalogoa() {
		this.JokalariZer=new ArrayList<Jokalaria>();
	}
	public static synchronized JokalariKatalogoa getnJK() {
		if(nJK==null) {
			nJK= new JokalariKatalogoa();
			
		}
		return (nJK);
	}
	public void addJok (Jokalaria pJok) {
		this.JokalariZer.add(pJok);
	}
	public void deleteJok (Jokalaria pJok) {
		this.JokalariZer.remove(pJok);
	}
	private Iterator<Jokalaria> getIter(){
		return JokalariZer.iterator();
	}
	public Jokalaria jokalariAurkituIdz(int pId) {
		Jokalaria emaitza=this.JokalariZer.get(pId);
		return emaitza;
	}
	public Jokalaria getJokalariaAusaz() {
		Random rand = new Random();
		int jok=rand.nextInt(JokalariZer.size());
		return JokalariZer.get(jok);
	}
	public void jokatu() {
		Jokalaria jok=this.getJokalariaAusaz();
		jok.setTurnoa(true);
		jok.erasoEgin();
	}
}
