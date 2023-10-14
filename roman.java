import java.util.Scanner;
import java.util.HashMap;

public class RomanToDecimal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter a roman numeral:");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int decimalNumber = romanToDecimal(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + decimalNumber);
    }

    public static int romanToDecimal(String roman) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(roman.charAt(i));
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }

        return result;
    }
}