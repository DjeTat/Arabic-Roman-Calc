package calcRun;

public class Calculation {
    static int resultArabic;

    public static void calculate() {

        if (DataValidation.mathSymbol == '^') {
            resultArabic = 1;
            for (int i = 1; i <= DataValidation.secondElement; i++) {
                resultArabic = resultArabic * DataValidation.firstElement;
            }
        } else {
            resultArabic = switch (DataValidation.mathSymbol) {
                case '+' -> DataValidation.firstElement + DataValidation.secondElement;
                case '-' -> DataValidation.firstElement - DataValidation.secondElement;
                case '*' -> DataValidation.firstElement * DataValidation.secondElement;
                case '/' -> DataValidation.firstElement / DataValidation.secondElement;
                default -> -1;
            };
        }
    }
}
