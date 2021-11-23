import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = 0;
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
            } else {
                System.out.println("Error type!");
                scanner.next();
            }
        }
        scanner.close();
        if (n < 15 && n > 0) {
            int Factorial = 1;
            int i = 1;
            while (!(n < i)) {
                Factorial = Factorial * i;
                i +=1 ;
            }
            System.out.println("Factorial of " + n + " is: " + Factorial);

        } else if (n == 0) {
            System.out.println("Factorial of 0 is: 1 ");
        }

        else {
            System.out.println("Error! Input a number from 1 to 15");
            return;
        }
        scanner.close();
    }
}
