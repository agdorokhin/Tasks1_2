import java.util.Scanner;

public class CheckIfPalindrome {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String originalWord=s.next();

        char[] a=originalWord.toCharArray();
        String reverseWord ="";
        for (int i=a.length-1; i>=0; i--) {
            reverseWord =reverseWord + originalWord.charAt(i);
        }

        if (reverseWord.equalsIgnoreCase(originalWord)) {
            System.out.println("Entered word is palindrome: " + reverseWord);
        } else System.out.print("Entered word is not palindrome: " + reverseWord);

    }
}
