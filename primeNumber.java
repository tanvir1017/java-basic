public class primeNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            boolean isPrime = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }
}
