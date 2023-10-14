import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String input = scanner.nextLine().toLowerCase();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    public static boolean isPangram(String input) {
        Set<Character> letters = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        
        return letters.size() == 26;
    }
}