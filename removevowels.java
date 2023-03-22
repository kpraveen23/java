import java.util.Scanner;

class RemoveVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        String newStr = str.replaceAll("[AEIOUaeiou]", "");
        
        System.out.println("The string with vowels removed is: " + newStr);
    }
}
