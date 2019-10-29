package teste;

public class Elemento {
	
	public Elemento() {
	}
	
	public Elemento(int numero) {
		this.numero = numero;
	}
	
	public Elemento(String caracter) {
		this.caracter = caracter;
	}
	
	private int numero;
	private String caracter;
	private Elemento proximo;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCaracter() {
		return caracter;
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	
	
	
}
