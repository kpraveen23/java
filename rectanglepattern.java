import java.util.Scanner;

 class RectanglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input symbol from the user
        System.out.print("Enter the symbol: ");
        char symbol = input.next().charAt(0);

        // Read the input dimensions from the user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Loop to print the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
