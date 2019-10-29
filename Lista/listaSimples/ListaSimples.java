package listaSimples;

public class ListaSimples {
	
	@Override
	public String toString() {
		String retorno = "";
		atual = primeiro;
		for (int i = 0; i < comprimento(); i++) {
			retorno+=atual.valor +" ";
			atual = atual.proximo;
		}
		return retorno;
	}
	
	private Elemento primeiro, ultimo,atual;
	private int tamanho;
	
	public ListaSimples() {
		primeiro = ultimo = atual = null;
		tamanho = 0;
	}
	
	// Métodos
	
	// Retorna um booleano indicando se a lista está vazia
	public boolean estaVazio() {
		return comprimento() == 0;
	}
	
	// Retorna o número de objetos da lista (tamanho)
	public int comprimento() {
		return tamanho;
	}
	
	// Insere um novo objeto como primeiro elemento
	public void inserePrimeiro(int v) {
		Elemento novo = new Elemento(v);
		if (estaVazio()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		} else {
			novo.proximo = primeiro;
			primeiro = novo;
		}
		tamanho++;
	}
	
	// Insere um novo objeto como Último elemento
	public void insereUltimo(int v) {
		Elemento novo = new Elemento(v);
		if (estaVazio()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		} else {
			ultimo.proximo = novo;
			ultimo = novo;
		}
		tamanho++;
	}
	
	// Move para a posição indicada
	public void moveParaPosicao(int pos) {
		atual = primeiro;
		for (int i=1; i<pos; i++) {
			atual = atual.proximo;
		}
	}
	
	// Insere um novo objeto na posição indicada
	public void insereNaPosicao(int v, int pos) {
		Elemento novo = new Elemento(v);
		moveParaPosicao(pos);
		novo.proximo=atual.proximo;
		atual.proximo=novo;
	}
	
	// Retorna o primeiro elemento da lista
	public int primeiro() {
		return primeiro.valor;
	}
	
	// Retorna o Último elemento da lista
	public int ultimo() {
		return ultimo.valor;
	}
	
	// Retorna o elemento na posição indicada
	public int elementoNaPosicao(int pos) {
		moveParaPosicao(pos);
		return atual.valor;
	}
	
	// Retorna a posição de um elemento na lista.Se não existir retorna um número negativo
	public int buscaElemento(int v) {
		int cont = 0;
		atual = primeiro;
		while(atual != null && atual.valor != v) {
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
	}
	
	// Remove o Último elemento da lista
	public void removeUltimo() {
		int pos;
		pos=comprimento()-1;
		moveParaPosicao(pos);
		atual.proximo=null;
		ultimo = atual;
	}
	
	// Remove da lista o elemento indicado
	public void removeElemento(int v) {
		int pos;
		Elemento temp;
		pos=buscaElemento(v);
		if (pos > -1) {
			temp=atual.proximo;
			pos=pos-1;
			moveParaPosicao(pos);
			atual.proximo=temp;
		}
	}
	
	// Remove o elemento da posição indicada
	public void removeNaPosicao(int pos) {
		Elemento temp;
		moveParaPosicao(pos);
		temp=atual.proximo;
		pos=pos-1;
		moveParaPosicao(pos);
		atual.proximo=temp;
	}
}
