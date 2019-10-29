package aula03ex2;

public class Fila {
	
	Elemento inicio,fim;
	int tamanho;
	
	public void inserir(int valor) {
		Elemento novo = new Elemento(valor);
		if (vazio()) {
			inicio=fim=novo;
		}else {
			fim.proximo = novo;
			fim = novo;
		}
		tamanho++;
	}
	
	public void retirar() {
		if (!vazio()) {
			System.out.println(inicio.valor);
			inicio = inicio.proximo;
			tamanho--;
		}
	}
	
	public Elemento frente() {
		return inicio;
	}
	
	public Elemento fim() {
		return fim;
	}
	
	public int tamanho() {
		return tamanho;
	}
	public boolean vazio() {
		return inicio==null;
	}
}