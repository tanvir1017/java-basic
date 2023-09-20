import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        try (Scanner inputANumber = new Scanner(System.in)) {
            System.out.print("enter a number");
            int number = inputANumber.nextInt();
            if (number > 10) {
                System.out.println("Given number is out of range");
            }
            else {
                if (number <= 10) {
                    System.out.println("Enter a number for how many time iterate the loop");
                    int iterateLoop = inputANumber.nextInt();
                    System.out.println(iterateLoop + "given number for loop");
                    for (int i = 0 ; i < iterateLoop; i++) {
                        System.out.println("number is" + i);
                        for (int j = 0; j <= iterateLoop; j++) {
                            String name = "anvir";
                            char sur = 'T'; //character method
                            System.out.println(j + sur + name);
                        }
                    }
                }
            }
        }
    }
}
