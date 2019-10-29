package aula03ex3;

public class Main {

	public static void main(String[] args) {
		int a = 1000;
		int b = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				for (int j2 = 0; j2 < a; j2++) {
					System.out.println(b);
					b++;
				}
			}
		}
	}
	
}