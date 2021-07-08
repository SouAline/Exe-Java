package entities;

import java.util.Locale;
import java.util.Scanner;

import aplication.Program;

public class Product {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Program product = new Program();
	System.out.println("Enter product data ");
	System.out.print("Name: ");
	product.name = sc.nextLine();
	System.out.print("Price R$: ");
	product.price = sc.nextDouble();
	System.out.print("Quantity in stock: ");
	product.quantity = sc.nextInt();// this variable is declareted with teclado
	
	System.out.println(product.name + " - " + product.price + " - " + product.quantity);
	sc.close();
	}

}
