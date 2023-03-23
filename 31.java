import java.util.Scanner;

 class LcmGcdOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = input.nextInt();

        int[] values = new int[n];
        int lcm = 1;
        int gcd = values[0];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            values[i] = input.nextInt();
            gcd = findGCD(gcd, values[i]);
            lcm = findLCM(lcm, values[i]);
        }

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);

        input.close();
    }

   
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

   
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
