package filaDinamica;

public class Fila {
	Elemento inicio;
	Elemento fim;
	static int tamanho;
	
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
		System.out.println(inicio.valor+"|"+fim.valor);
		inicio = inicio.proximo;		
	}
		
}