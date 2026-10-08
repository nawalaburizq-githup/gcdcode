import java.util.Scanner;

public class GCD {

    public static int gcd(int a, int b) { 
         a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) { 
            int remainder = a % b; 

            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.println("GCD = " + gcd(a, b));

        input.close();
    }
}