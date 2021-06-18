import java.util.Locale;
import java.util.Scanner;
public class exe002 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double pi = 3.14159;
        double circulo = 1;
        circulo = Math.pow(circulo, 2);
        double calculo = pi * circulo;
        Locale.setDefault(Locale.US);
        System.out.printf("A área do circulo é de %.4f",calculo);
        sc.close();        
    }
}