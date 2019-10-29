package pilhaObject;

public class Main {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.inserir(1);
		pilha.inserir("a");
		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando:"+pilha.retirar());
		}
	}
}