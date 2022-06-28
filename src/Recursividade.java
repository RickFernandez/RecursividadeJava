public class Recursividade {
    
    public static int fatorialNaoRecursivo (int num) {
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }
        return total;
    }

    public static int fatorialRecursivo (int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorialRecursivo(num - 1);
    }

    public static void main(String[] args) {

        System.out.println(fatorialNaoRecursivo(5));
        System.out.println(fatorialRecursivo(5));
    }
}
