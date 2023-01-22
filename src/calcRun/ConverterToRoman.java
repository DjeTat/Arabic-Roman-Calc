package calcRun;

import java.util.List;

public class ConverterToRoman {
    private static final List<Integer> ARABIC_VALUES = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
    private static final List<String> ROMAN_VALUES = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

    public static String convert(long tempResult) throws InputException {
        if (isResultValid(tempResult)) {
            return toRoman(tempResult);
        } else {
            throw new InputException("\nToo large number to convert");
        }
    }

    private static boolean isResultValid(long tempResult) {
        return tempResult <= 4000;
    }

    private static String toRoman(long tempResult) {

        long tempResultPositive = Math.abs(tempResult);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ARABIC_VALUES.size(); i++) {
            while (tempResultPositive >= ARABIC_VALUES.get(i)) {
                tempResultPositive -= ARABIC_VALUES.get(i);
                result.append(ROMAN_VALUES.get(i));
            }
        }
        if (tempResult < 0) {
            result.insert(0, "-");
        }
        return result.toString();
    }
}

