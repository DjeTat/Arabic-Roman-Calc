package calcRun;

public class Calculation {
    private static long arabicResult;

    public static String getResult() throws InputException {
        String finalResult;

        if (InputDataDefinition.isAreNumbersRoman()) {
            finalResult = ConverterToRoman.getResultRoman();
        } else {
            finalResult = String.valueOf(arabicResult);
        }
        return finalResult;
    }

    public static long calculate() throws InputException {

        InputDataDefinition.defineElements();

        if (InputDataDefinition.getMathSymbol().equals("^")) {
            arabicResult = 1;
            for (int i = 1; i <= InputDataDefinition.getSecondElement(); i++) {
                arabicResult = arabicResult * InputDataDefinition.getFirstElement();
            }
        } else {
            arabicResult = switch (InputDataDefinition.getMathSymbol()) {
                case "+" -> InputDataDefinition.getFirstElement() + InputDataDefinition.getSecondElement();
                case "-" -> InputDataDefinition.getFirstElement() - InputDataDefinition.getSecondElement();
                case "*" -> (long) InputDataDefinition.getFirstElement() * InputDataDefinition.getSecondElement();
                case "/" -> InputDataDefinition.getFirstElement() / InputDataDefinition.getSecondElement();
                default -> -1;
            };
        }
        return arabicResult;
    }
}

