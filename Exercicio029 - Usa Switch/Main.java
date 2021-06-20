import java.util.Scanner;

public class Main {
 public static void main(String args[]){
     System.out.println("Digite um número entre 1 e 4");
     Scanner teclado = new Scanner(System.in);
     int numeroEscolhido = teclado.nextInt();
     switch(numeroEscolhido){
         case 1: 
            System.out.println("Opção 1 escolhida");
            break;
        case 2:
            System.out.println("Opção 2 escolhida");
            break;
        case 3:
            System.out.println("Opção 3 escolhida");
            break;
        case 4:
            System.out.println("Opção 4 escolhida");
            break;
        default:
            System.out.println("Opção digitada não existe");
            break;

            

     }
 }   
}
