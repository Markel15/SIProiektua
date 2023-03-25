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
	public Jokalaria getJokalariaAusaz(Jokalaria pJok) {
		Random rand = new Random();
		boolean aurk=false;
		Jokalaria emaitza=null;
		while(!aurk) {
			int jok=rand.nextInt(JokalariZer.size());
			emaitza=JokalariZer.get(jok);
			if(!emaitza.equals(pJok)) aurk=true;
		}
		return emaitza;
	}
	public void jokatu() {
		Iterator<Jokalaria> itr=this.getIter();
		while(itr.hasNext()) {
			Jokalaria j=itr.next();
			j.setTurnoa(false);
		}
		Jokalaria jok=this.getJokalariaAusaz(null);
		jok.setTurnoa(true);
		jok.erasoEgin();
	}
}
