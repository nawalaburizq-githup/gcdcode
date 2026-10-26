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

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = s.nextInt();

        System.out.print("Enter b: ");
        int b = s.nextInt();

        System.out.println("GCD = " + gcd(a, b));

        s.close();
    }
}