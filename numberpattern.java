import java.util.Scanner;

 class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input from the user
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

        // Loop to print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i-j) / (j+1);
            }
            System.out.println();
        }

        input.close();
    }
}
