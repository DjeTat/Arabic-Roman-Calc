package calcRun;

import java.util.List;

public class ArabicNumber {

    private static final List<String> ARABIC_NUMBERS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

    public static boolean areNumbersValid(List<String> userData) {
        return ARABIC_NUMBERS.contains(userData.get(0)) && ARABIC_NUMBERS.contains(userData.get(2));
    }

    public static long defineNumberValue(String number) {
        return Long.parseLong(number);
    }
}
