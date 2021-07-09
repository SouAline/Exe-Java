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
	System.out.println("Quantity in stock: ");
	product.quantity = sc.nextInt();
	
	System.out.println(product.name + " - " + product.price + " - " + product.quantity);

	System.out.println();
	System.out.println("Enter the number of products added in stock: ");
	int quantity = sc.nextInt();
	product.addProducts(quantity);
	System.out.println("Update data: " + product);
	
	System.out.println();
	System.out.println("Enter the number of products to be removed from stock: ");
	quantity = sc.nextInt();
	product.removeProducts(quantity);
	System.out.println("Update data: " + product);
	
	System.out.println(product.name + " - " + product.price + " - " + product.quantity);
	sc.close();
			
	}

}
