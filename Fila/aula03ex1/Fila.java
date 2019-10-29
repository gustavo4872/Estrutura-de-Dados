package aula03ex1;

public class Fila {
	Elemento inicio;
	Elemento fim;
	int tamanho = 0;
	
	public Elemento frente() {
		return inicio;
	}
	
	public void insere(int valor) {
		Elemento novo = new Elemento(valor);
		if (vazio()) {
			inicio = novo;
			fim = novo;
		}else {
			fim.proximo = novo;
			fim = novo;
		}
		tamanho++;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public boolean vazio() {
		return tamanho==0;
	}
	
	public void retira() {
		inicio = inicio.proximo;	
		tamanho--;
	}
		
}