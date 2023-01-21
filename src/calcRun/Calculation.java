package calcRun;

import java.util.List;

public class Calculation {


    public static String calculate(List<String> userData) throws InputException {
        long firstNumber = InputDataDefinition.defineFirstElement(userData);
        long secondNumber = InputDataDefinition.defineSecondElement(userData);
        String mathSymbol = InputDataDefinition.defineMathSymbol(userData);
        long tempResult = doCalculate(firstNumber, mathSymbol, secondNumber);
        return InputDataDefinition.defineResult(tempResult);

    }

    public static long doCalculate (long firstNumber, String mathSymbol, long secondNumber) {
        return switch (mathSymbol) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            case "^" -> pow(firstNumber, secondNumber);
            default -> throw new IllegalArgumentException();
        };
    }

    private static long pow(long firstNumber, long secondNumber) {
        long result = 1;
        for (int i = 0; i < secondNumber; i++) {
            result = result * firstNumber;
        }
        return result;
    }
}

