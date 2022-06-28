// Escreva um método recursivo e estático que calcule e retorne o N-ésimo termo da sequência Fibonacci

public class Fibonacci {
    
    public static int fibonacci(int num) {

        if (num < 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        
        for(int i = 1; i < 10; i++) {
            System.out.println(fibonacci(i)); 
        }
    }
}
