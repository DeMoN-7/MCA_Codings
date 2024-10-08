import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            int n = number;
            int binary[] = new int[32];
            int index = 0;
            while (n > 0) {
                binary[index++] = n % 2;
                n /= 2;
            }
            System.out.print("Binary representation: ");
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(binary[i]);
            }
            System.out.println();
        } else {
            int n = number;
            int octal[] = new int[32];
            int index = 0;
            while (n > 0) {
                octal[index++] = n % 8;
                n /= 8;
            }
            System.out.print("Octal representation: ");
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(octal[i]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
