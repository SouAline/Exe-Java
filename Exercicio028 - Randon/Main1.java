import java.util.Random;

public class Main1{
    public static void main(String args[]){
        int numero = new Random().nextInt(200) - 100;
        System.out.println("O número gerado é: " + numero);
        if(numero%2 == 0){
            if(numero > 0) {
                System.out.println("O número é par e positivo");
            }else{
            System.out.println("O número é par e negativo");
             }

        }else{
             if (numero > 0){
                System.out.println("O numero é impar e positivo");
            }else{
                System.out.println("O número é impar e negativo");
            }
        }
          

        
    }
}