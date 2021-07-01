public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
		
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //the word "this" will mean using the variable declared earlier in the code
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity; //the second quantity wiil mean using the variable declared in side the "()"
		
	}
}

