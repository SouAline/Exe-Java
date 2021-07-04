public class exe027 {
    public static void metodo1(){

        System.out.println("Eu sou um metodo que não retorna valos devido ao nome void");
    
    }
    public static int metodo2(){
        System.out.println("Eu sou um metodo que retorna valor inteiro");
        return 1;
    }
    public static void metodo3(String nome, int idade){
        System.out.println("Eu sou um metodos que não retorna valor");
        System.out.println("Recebe dois parametros");
        System.out.println("Uma string nome: " + nome);
        System.out.println("Um inteiro idade: " + idade);

    }
    public static void main(String args[]){
        metodo1();
        System.out.println("O valor retornado pelo método 2 é: " + metodo2());
        metodo3("Rafael",29);
    }
    
}
