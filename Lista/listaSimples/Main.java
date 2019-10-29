package listaSimples;

public class Main {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		lista.inserePrimeiro(1);
		lista.inserePrimeiro(1);
		lista.inserePrimeiro(3);
		lista.insereUltimo(2);
		lista.insereNaPosicao(0, 1);
		System.out.println(lista);

	}

}