/* import java.util.Scanner;

public class fibonacchi {
    public static void main(String[] args) {
        try (Scanner inputFibo = new Scanner(System.in)) {
            System.out.println("Enter the number of fibonacci series");
            int inputLoopNumber = inputFibo.nextInt();
            int fistTerm = 0;
            int secondTerm = 1;
            System.out.println(fistTerm + " " + secondTerm);
            for (int i = 2; i < inputLoopNumber; i++) {
                int nextTerm = fistTerm + secondTerm;
                System.out.println(nextTerm+ " ");
                fistTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}
 */

public class fibonacchi {
    static int fibonacciElement(int num){
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonacciElement(num - 1) + fibonacciElement(num - 2);
    }

    public static void main(String[] args) {
        int func = fibonacciElement(10);
        System.out.println(func);
    }
}