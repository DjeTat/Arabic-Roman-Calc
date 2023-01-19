package calcRun;

public class Calculation {
    private static long resultArabic;
    public static void calculate() {

        if (DataConversion.getMathSymbol().equals("^")) {
            resultArabic = 1;
            for (int i = 1; i <= DataConversion.getSecondElement(); i++) {
                resultArabic = resultArabic * DataConversion.getFirstElement();
            }
        } else {
            resultArabic = switch (DataConversion.getMathSymbol()) {
                case "+" -> DataConversion.getFirstElement() + DataConversion.getSecondElement();
                case "-" -> DataConversion.getFirstElement() - DataConversion.getSecondElement();
                case "*" -> (long) DataConversion.getFirstElement() * DataConversion.getSecondElement();
                case "/" -> DataConversion.getFirstElement() / DataConversion.getSecondElement();
                default -> -1;
            };
        }
    }
    public static long getResultArabic() {
        return resultArabic;
    }
}
