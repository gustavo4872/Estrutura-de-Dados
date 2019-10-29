package listaDupla;

public class NoProjetoDupla {
	
	public String nomeEtapa;
	public int tempo;
	public NoProjetoDupla proximo,anterior;
	
	public NoProjetoDupla(String pnomeEtapa, int ptempo) {
		nomeEtapa= pnomeEtapa;
		tempo= ptempo;
		proximo= null;
		anterior= null;
	}
	
}
