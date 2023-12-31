public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) { //n>2
        boolean a = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                a = false;
                break;
            }
        }
        return a;
    }
}