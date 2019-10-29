package pilhaObject;

public class Pilha {
	
	public Pilha() {
	}
	
	private No topo;
	
	public boolean estaVazia() {
		return topo==null;
	}
	
	public void inserir(Object valor) {
		No novo = new No(valor);
		if (estaVazia()) {
			this.topo = novo;
		}else {
			novo.proximo = this.topo;
			this.topo = novo;
		}
	}
	
	public Object retirar(){
		Object retorno = this.topo.valor;
		this.topo = topo.proximo;
		return retorno;
	}	
}