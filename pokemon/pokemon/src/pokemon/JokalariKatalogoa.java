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
	public static JokalariKatalogoa getnJK() {
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
	private boolean irabazlerikDago() { //Agian JAVA8-rekin egin daiteke
		boolean emaitza=false;
		int i=0;
		while(i<this.JokalariZer.size()&&!emaitza) {
			if (this.JokalariZer.get(i).getGaldu()) {
				emaitza=true;
			}
			i++;
		}
		return emaitza;
	}
	
	public void jokatu() {
		Iterator<Jokalaria> itr=this.getIter();
		while(itr.hasNext()) {
			Jokalaria j=itr.next();
			if(j.getBizirikDaudenak()==0) {
				j.setGaldu();
			}
			j.setTurnoa(false);
		}
		Jokalaria jok=this.getJokalariaAusaz(null);
		if(!(jok instanceof Bot)) Nagusia.getNagusia().amaitu();
		jok.setTurnoa(true);
		jok.erasoEgin();
		if(this.irabazlerikDago()) {
			Nagusia.getNagusia().amaitu();
		}
	}
}
