package calcRun;

import java.util.List;

public class ArabicNumber {

    private static final List<String> ARABIC_NUMBERS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

    public static boolean areNumbersValid(String firstSymbol, String secondSymbol) {
        return ARABIC_NUMBERS.contains(firstSymbol) && ARABIC_NUMBERS.contains(secondSymbol);
    }

    public static int getNumberValue (String symbol) {
        return Integer.parseInt(symbol);
    }
}
