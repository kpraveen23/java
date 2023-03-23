import java.util.Scanner;

 class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reversedNum = 0;

        
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

      
        System.out.println("Reversed Number: " + reversedNum);

        input.close();
    }
}
