import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numeto inteiro: ");
		int numero = teclado.nextInt();
		for (int contador=0; contador < numero; contador++) {
			int impar = (contador % 2);
			if (impar != 0) {
				System.out.printf("O número %d é ímpar %n", contador);
			}else {
				System.out.printf("O número %d é par   %n", contador);
			}
		teclado.close();
		}

	}

}
