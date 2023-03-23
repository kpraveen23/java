import java.util.Scanner;

 class DecimalToBinaryReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        
        int[] binaryArray = new int[32]; // to store the binary digits
        int index = 0;
        while (decimal > 0) {
            binaryArray[index++] = decimal % 2;
            decimal /= 2;
        }

      
        int binary = 0;
        for (int i = index - 1; i >= 0; i--) {
            binary = binary * 10 + binaryArray[i];
        }

       
        System.out.println("Reverse of Binary: " + binary);

        input.close();
    }
}
