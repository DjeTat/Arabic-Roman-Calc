package calcRun;

import java.util.List;

public class ConverterToRoman {

    public static String convert(long tempResult) throws InputException {
        if(isResultValid(tempResult)) {
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

        List<Integer> arabicValues = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        List<String> romanValues = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arabicValues.size(); i++) {
            while (tempResultPositive >= arabicValues.get(i)) {
                tempResultPositive -= arabicValues.get(i);
                result.append(romanValues.get(i));
            }
        }
        if (tempResult < 0) {
            result.insert(0, "-");
        }
        return result.toString();
    }
}

