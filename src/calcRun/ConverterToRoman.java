package calcRun;

import java.util.List;
public class ConverterToRoman {
    private static String resultRoman;
    public static void getRomanNumber() throws InputException {

        if (Calculation.getResultArabic() > 4000) {
            throw new InputException("\nToo large number to convert. Try again");
        }  else {
            long resultPositive = Math.abs(Calculation.getResultArabic());
            List<Integer> arabicValues = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
            List<String> romanValues = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < arabicValues.size(); i++) {
                while (resultPositive >= arabicValues.get(i)) {
                    resultPositive -= arabicValues.get(i);
                    result.append(romanValues.get(i));
                }
            }
            if (Calculation.getResultArabic() < 0) {
                result.insert(0, "-");
            }
            resultRoman = result.toString();
        }
    }
    public static String getResultRoman() {
        return resultRoman;
    }
}
