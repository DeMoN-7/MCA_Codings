import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number (x): ");
        double x = scanner.nextDouble();
        
        int y = (int) Math.ceil(x);
        System.out.println("Ceiling of " + x + " is: " + y);
        
        int twosComplement = ~y + 1;
        System.out.println("2's complement of " + y + " is: " + twosComplement);
        
        scanner.close();
    }
}
