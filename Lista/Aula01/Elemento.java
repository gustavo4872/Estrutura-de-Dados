package Aula01;

public class Elemento {
	
	public Elemento() {
		valor = 0;
		proximo = null;
	}
	
	public Elemento(int valor) {
		this.valor = valor;
		proximo = null;
	}
	
	int valor;
	Elemento proximo;
}
