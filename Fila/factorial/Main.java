package factorial;


public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.push(10);
		fila.push(9);
		fila.push(8);
		fila.pop();
		fila.pop();
		fila.pop();
		fila.pop();
	}
	
	public static int factorial(int n) {
		if (n<=1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}