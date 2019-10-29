package aula03ex1;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Pilha pilha = new Pilha();
		fila.insere(1);
		fila.insere(2);
		fila.insere(3);
		fila.insere(4);
		int controle = 0;
		int repeticoes = fila.tamanho*2;
		do {
			if (controle<repeticoes/2) {
				pilha.empilha(fila.frente().valor);
				fila.retira();
			}else {
				fila.insere(pilha.desempilha());	
			}
			controle++;
		} while (controle<repeticoes);
		repeticoes =  fila.tamanho;
		for (int i = 0; i < repeticoes; i++) {
			System.out.println(fila.inicio.valor);
			fila.retira();
		}
		/*
		 * do {
			pilha.empilha(fila.frente().valor);
			fila.retira();
		} while (!fila.vazio());
		do {
			fila.insere(pilha.desempilha());
		} while (!pilha.estaVazia());
		 */
		
	}
}