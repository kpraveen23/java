import java.util.Scanner;

 class VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = input.nextLine();
        
        int vowelCount = 0;
        for (int i = 0; i < statement.length(); i++) {
            char c = statement.charAt(i);
            if (isVowel(c)) {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels in the statement: " + vowelCount);
    }
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

