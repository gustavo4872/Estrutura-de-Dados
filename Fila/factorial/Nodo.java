package factorial;

public class Nodo {
	
	public Nodo() {
		this(0, null);
	}
	
	public Nodo(int value) {
		this.value = value;
		next = null;
	}
	
	public Nodo(int value, Nodo next) {
		this.value = value;
		this.next = next;
	}
	
	int value = 0;
	Nodo next;
	
	
	 
}
