package Domain;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = teclado.next();
		System.out.print("Sal�rio Bruto: ");
		Float salarioBruto = teclado.nextFloat();
		System.out.print("Taxas a descontar: ");
		Float taxaTotal = teclado.nextFloat();
		System.out.println("Empregado" + nome + "R$" + salarioBruto);
		System.out.println("Qual a porcentagem que voc� quer adicionar ao salario: ");
		float percentual = teclado.nextFloat();
		System.out.print("Salario atualizado de" + nome + "R$" + salarioAtualizado);
		
		teclado.close();
	}
	
}
