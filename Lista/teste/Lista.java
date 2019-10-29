package teste;

public class Lista {
	
	private Elemento inicio;
	private Elemento fim;
	private int tamanho;
	
	public void insereInicio(String elemento) {
		Elemento novo = new Elemento(elemento);
		if (!vazio()) {
			novo.setProximo(inicio);
			setinicio(novo);
		}else {
			setinicio(novo);
			setFim(novo);
			novo.setProximo(novo);
		}
	}
	
	public void insereMeio() {
		
	}
	
	public void insereFim() {
		
	}
	
	private boolean vazio() {
		return inicio==null;
	}
	
	public Elemento getinicio() {
		return inicio;
	}
	public void setinicio(Elemento inicio) {
		this.inicio = inicio;
	}
	public Elemento getFim() {
		return fim;
	}
	public void setFim(Elemento fim) {
		this.fim = fim;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
