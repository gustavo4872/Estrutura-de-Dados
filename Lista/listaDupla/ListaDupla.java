package listaDupla;

public class ListaDupla {
	
	private NoProjetoDupla primeiro, ultimo, atual;
	private int tamanho;
	
	public ListaDupla() {
		primeiro = ultimo = atual = null;
		tamanho = 0;
	}
	
// m�todos
	
	public boolean estaVazio() {
		return comprimento()==0;
	}
		
	public int comprimento() {
		return tamanho;
	}
	
	public void inserePrimeiro(String n, int t) {
		NoProjetoDupla novo = new NoProjetoDupla(n,t);
		if (estaVazio()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		} else {
			novo.proximo = primeiro;
			primeiro.anterior = novo;
			primeiro = novo;
		}
	}
	
	public void insereUltimo(String n, int t) {
		NoProjetoDupla novo = new NoProjetoDupla(n,t);
		if (estaVazio()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		} else {
			ultimo.proximo = novo;
			novo.anterior = ultimo;
			ultimo = novo;
		}
	}
	
	// Move para a posi��o indicada
	public void moveParaPosicao(int pos) {
		atual = primeiro;
		for (int i=1; i<pos; i++) {
			atual = atual.proximo;
		}
	}
	
	// Insere um novo objeto na posi��o indicada
	public void insereNaPosicao(String n, int t, int pos) {
		NoProjetoDupla novo = new NoProjetoDupla(n,t);
		moveParaPosicao(pos);
		novo.proximo=atual.proximo;
		novo.anterior=atual;
		atual.proximo=novo;
		novo.proximo.anterior=novo;
	}
	
	// Retorna o primeiro elemento da lista
	public NoProjetoDupla primeiro() {
		return primeiro;
	}
	
	// Retorna o �ltimo elemento da lista
	public NoProjetoDupla ultimo() {
		return ultimo;
	}
	
	// Retorna o elemento na posi��o indicada
	public NoProjetoDupla elementoNaPosicao(int pos) {
		moveParaPosicao(pos);
		return atual;
	}
	
	// Retorna a posi��o de um elemento na lista. Se n�o existir
	// retorna um n�mero negativo
	public int buscaElemento(String n) {
		int cont = 0;
		atual = primeiro;
		while(atual != null && atual.nomeEtapa.equals(n)) {
			atual = atual.proximo;
			cont ++;
		}
		if (atual != null) {
			return cont;
		}
		return -1;
	}
	
	// Remove o primeiro elemento da lista
	public void removePrimeiro() {
		primeiro = primeiro.proximo;
		primeiro.anterior = null;
	}
	
	// Remove o �ltimo elemento da lista
	public void removeUltimo() {
		atual=ultimo.anterior;
		atual.proximo= null;
		ultimo= atual;
	}
	
	// Remove o elemento da posi��o indicada
	public void removeNaPosicao(int pos) {
		NoProjetoDupla temp;
		moveParaPosicao(pos);
		temp=atual.proximo;
		atual= atual.anterior;
		atual.proximo=temp;
		temp.anterior=atual;
	}
}
