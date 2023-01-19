package calcRun;

public class Calculation {
    private static long resultArabic;
    public static void calculate() {

        if (DataValidation.getMathSymbol().equals("^")) {
            resultArabic = 1;
            for (int i = 1; i <= DataValidation.getSecondElement(); i++) {
                resultArabic = resultArabic * DataValidation.getFirstElement();
            }
        } else {
            resultArabic = switch (DataValidation.getMathSymbol()) {
                case "+" -> DataValidation.getFirstElement() + DataValidation.getSecondElement();
                case "-" -> DataValidation.getFirstElement() - DataValidation.getSecondElement();
                case "*" -> (long) DataValidation.getFirstElement() * DataValidation.getSecondElement();
                case "/" -> DataValidation.getFirstElement() / DataValidation.getSecondElement();
                default -> -1;
            };
        }
    }
    public static long getResultArabic() {
        return resultArabic;
    }
}
