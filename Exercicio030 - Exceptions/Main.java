import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite alguns nomes: ");
        String nomes = teclado.next();

        try{
        String[] vetor = teclado.nextLine().split(" ");
        System.out.println("Digite uma posição para verificar nome: ");
        int posicao = teclado.nextInt();
        System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição Inválida");
        }
        catch (InputMismatchException e){
            System.out.println("Caracter digitado inválido!");
        }

        System.out.println("Fim do programa");


        teclado.close();
    }
    
}