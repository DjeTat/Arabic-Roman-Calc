package calcRun;

import java.util.List;

public class InputDataDefinition {
    private static boolean areNumbersRoman;

    public static long defineFirstElement(List<String> userData) throws InputException {
        if (RomanNumber.areNumbersValid(userData)) {
            areNumbersRoman = true;
            return RomanNumber.defineNumberValue(userData.get(0));
        } else if (ArabicNumber.areNumbersValid(userData)) {
            return ArabicNumber.defineNumberValue(userData.get(0));
        } else {
            throw new InputException("Invalid input.Try again");
        }
    }

    public static long defineSecondElement(List<String> userData) throws InputException {
        if (RomanNumber.areNumbersValid(userData)) {
            return RomanNumber.defineNumberValue(userData.get(2));
        } else if (ArabicNumber.areNumbersValid(userData)) {
            return ArabicNumber.defineNumberValue(userData.get(2));
        } else {
            throw new InputException("Invalid input.Try again");
        }
    }

    public static String defineMathSymbol(List<String> userData) throws InputException {
        if (MathSymbol.isMathSymbolValid(userData)) {
            return userData.get(1);
        } else {
            throw new InputException("Invalid input. Try again");
        }
    }

    public static String defineResult(long tempResult) throws InputException {
        if (areNumbersRoman) {
            return ConverterToRoman.convert(tempResult);
        } else {
            return String.valueOf(tempResult);
        }
    }
}
