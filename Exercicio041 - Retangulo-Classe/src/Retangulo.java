
public class Retangulo {

	private double altura;
	private double largura;
	
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double area() {
		double area = largura * altura;
		return area;
	}
	
	public double perimetro() {
		double perimetro = ((largura * 2) + (altura * 2));
		return perimetro;
	}
	public double diagonal() {
		double diagonal = Math.sqrt(altura * altura + largura * largura);
		return diagonal;
	}
	
	
	
}

