import java.util.Scanner;
//this program show wath number is the bigger
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int number1 = teclado.nextInt();
        int number2 = teclado.nextInt();
        int number3 = teclado.nextInt();
        
        int heigher = max(number1, number2, number3);
        showResult(heigher);
        teclado.close();  
    }
    
    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x> z){
            aux = x;
        }else if(y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Heigher = " + value);
    }
}
