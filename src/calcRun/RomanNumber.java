package calcRun;

import java.util.Map;

public class RomanNumber {
    private static final Map<String, Integer> ROMAN_NUMBERS = Map.of("I", 1, "II", 2, "III",
            3, "IV", 4, "V", 5, "VI", 6, "VII",
            7, "VIII", 8, "IX", 9, "X", 10);

    public static boolean areNumbersValid(String firstSymbol, String secondSymbol) {
        return ROMAN_NUMBERS.containsKey(firstSymbol) && ROMAN_NUMBERS.containsKey(secondSymbol);
    }

    public static int getNumberValue(String symbol) {
        return ROMAN_NUMBERS.get(symbol);
    }
}
