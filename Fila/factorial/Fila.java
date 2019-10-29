package factorial;

public class Fila {
	
	Nodo begginig;
	Nodo finish;
	int size = 0;
	
	public void push(int value) {
		Nodo newNodo = new Nodo(value);
		if (isEmpty()) {
			begginig = finish = newNodo;
		}else {
			finish.next = newNodo;
			finish=newNodo;
		}
		size++;
	}
	
	public void pop() {
		if (!isEmpty()) {
			begginig = begginig.next;
			size--;
		}else {
			System.out.println(finish.value);
		}
	}
	
	public boolean isEmpty() {
		return begginig==null;
	}
	
	public int size() {
		return this.size;
	}
	
	public Nodo top() {
		return this.begginig;
	}
	
	public double media(Nodo top) {
		if (top!=null) {
			return top.value+media(top.next);
		}else {
			return 0;
		}
	}
}