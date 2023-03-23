import java.util.Scanner;

 class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

       
        for (int i = n; i >= 1; i--) {
           
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
           
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
