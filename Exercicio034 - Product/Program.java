public class Program {
    import java.util.Locale;
    import java.util.Scanner;

	public static void  main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Product product = new Product();
	System.out.println("Enter product data: ");
	System.out.println("Name: ");
	product.name = sc.nextLine();
	System.out.println("Price R$: ");
	product.price = sc.nextDouble();
	System.out.println("Quantity in stock: ");
	product.quantity = sc.nextInt();// this variable is declareted with teclado
	
	System.out.println(product.name + " - " + product.price + " - " + product.quantity);
	sc.close();
	}
    
}
