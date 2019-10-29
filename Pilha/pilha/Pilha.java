package pilha;

public class Pilha {
	
	Elemento topo;
	
	public void push(int valor) {
		Elemento novo = new Elemento();
		novo.valor = valor;
		if (isEmpty()) {
			this.topo = novo;
		}else {
			novo.proximo = topo;
			topo = novo;
		}
	}
	
	public boolean isEmpty() {
		return topo == null;
	}
	
}	
