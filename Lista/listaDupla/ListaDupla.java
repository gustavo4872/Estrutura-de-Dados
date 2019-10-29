package listaDupla;

public class ListaDupla {
	
	private NoProjetoDupla primeiro, ultimo, atual;
	private int tamanho;
	
	public ListaDupla() {
		primeiro = ultimo = atual = null;
		tamanho = 0;
	}
	
// métodos
	
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
	
	// Move para a posição indicada
	public void moveParaPosicao(int pos) {
		atual = primeiro;
		for (int i=1; i<pos; i++) {
			atual = atual.proximo;
		}
	}
	
	// Insere um novo objeto na posição indicada
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
	
	// Retorna o Último elemento da lista
	public NoProjetoDupla ultimo() {
		return ultimo;
	}
	
	// Retorna o elemento na posição indicada
	public NoProjetoDupla elementoNaPosicao(int pos) {
		moveParaPosicao(pos);
		return atual;
	}
	
	// Retorna a posição de um elemento na lista. Se não existir
	// retorna um número negativo
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
	
	// Remove o Último elemento da lista
	public void removeUltimo() {
		atual=ultimo.anterior;
		atual.proximo= null;
		ultimo= atual;
	}
	
	// Remove o elemento da posição indicada
	public void removeNaPosicao(int pos) {
		NoProjetoDupla temp;
		moveParaPosicao(pos);
		temp=atual.proximo;
		atual= atual.anterior;
		atual.proximo=temp;
		temp.anterior=atual;
	}
}
