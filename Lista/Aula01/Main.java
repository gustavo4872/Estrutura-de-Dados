package Aula01;


public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.insereUltimo(5);
		lista.inserePrimeiro(10);
		
		System.out.println(lista.buscaElemento(10));
	}

}
