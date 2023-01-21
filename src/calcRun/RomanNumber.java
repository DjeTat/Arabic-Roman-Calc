package calcRun;

import java.util.List;
import java.util.Map;

public class RomanNumber {
    private static final Map<String, Integer> ROMAN_NUMBERS = Map.of("I", 1, "II", 2, "III",
            3, "IV", 4, "V", 5, "VI", 6, "VII",
            7, "VIII", 8, "IX", 9, "X", 10);



    public static boolean areNumbersValid(List<String> userData) {
        return ROMAN_NUMBERS.containsKey(userData.get(0)) && ROMAN_NUMBERS.containsKey(userData.get(2));
    }

    public static long defineNumberValue(String number) {
        return ROMAN_NUMBERS.get(number);
    }
}
