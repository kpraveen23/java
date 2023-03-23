import java.util.Scanner;

 class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input from the user
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

        // Loop to print the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
