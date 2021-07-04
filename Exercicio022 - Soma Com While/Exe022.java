import java.util.Scanner;

public class Exe022 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o tipo de combustível abastecido");
		System.out.println("Digite 1 ..................... Álcool");
		System.out.println("Digite 2 ................... Gasolina");
		System.out.println("Digite 3 ..................... Diesel");
		System.out.println("Digite 4 ........................ Fim");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int codigo = teclado.nextInt();
		
		while (codigo <= 3 ) {
			if (codigo == 1) {
				alcool += 1;
				}
			else if (codigo == 2) {
				gasolina += 1;
			}
			else if (codigo == 3) {
				diesel += 1;
			}
			codigo = teclado.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		teclado.close();
			}
		}