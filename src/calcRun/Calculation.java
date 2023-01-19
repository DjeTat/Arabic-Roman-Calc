package calcRun;

public class Calculation {
    private static long arabicResult;

    public static String getResult() throws InputException {
        String finalResult;

        if (InputDataConversion.isAreNumbersRoman()) {
            finalResult = ConverterToRoman.getResultRoman();
        } else {
            finalResult = String.valueOf(arabicResult);
        }
        return finalResult;
    }

    public static long calculate() {

        if (InputDataConversion.getMathSymbol().equals("^")) {
            arabicResult = 1;
            for (int i = 1; i <= InputDataConversion.getSecondElement(); i++) {
                arabicResult = arabicResult * InputDataConversion.getFirstElement();
            }
        } else {
            arabicResult = switch (InputDataConversion.getMathSymbol()) {
                case "+" -> InputDataConversion.getFirstElement() + InputDataConversion.getSecondElement();
                case "-" -> InputDataConversion.getFirstElement() - InputDataConversion.getSecondElement();
                case "*" -> (long) InputDataConversion.getFirstElement() * InputDataConversion.getSecondElement();
                case "/" -> InputDataConversion.getFirstElement() / InputDataConversion.getSecondElement();
                default -> -1;
            };
        }
        return arabicResult;
    }
}

