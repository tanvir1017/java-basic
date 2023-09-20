import java.util.Scanner;

public class triAngle {
    public static void main(String[] args) {
        try (Scanner inputBaseAndHeight = new Scanner(System.in)) {
        System.out.println("Enter a triangle base number");
        float base = inputBaseAndHeight.nextFloat();
        
        System.out.println("Enter a triangle height number");
        float height = inputBaseAndHeight.nextFloat();
        
        float area =  (base * height) * (1/2);
        System.out.println(area);    
        };
    }
}
