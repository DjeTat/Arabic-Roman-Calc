package calcRun;

public class DataConversion {
    private static int firstElement;
    private static int secondElement;
    private static String mathSymbol;
    private static boolean areNumbersArabic;

    public static void checkElements() throws InputException {
        String[] dataArray = InputReader.getUserData().toUpperCase().split(" ");

        if (dataArray.length != 3) {
            throw new InputException("Invalid input. Try again");
        }

        if(RomanNumber.areNumbersValid(String.valueOf(dataArray[0]), String.valueOf(dataArray[2]))) {
            firstElement = RomanNumber.getNumberValue(String.valueOf(dataArray[0]));
            secondElement = RomanNumber.getNumberValue(String.valueOf(dataArray[2]));
        } else if (ArabicNumber.areNumbersValid(String.valueOf(dataArray[0]), String.valueOf(dataArray[2]))){
            firstElement = ArabicNumber.getNumberValue(String.valueOf(dataArray[0]));
            secondElement = ArabicNumber.getNumberValue(String.valueOf(dataArray[2]));
            areNumbersArabic = true;
        } else {
            throw new InputException("Invalid input. Try again");
        }

        if(MathSymbol.isMathSymbolValid(String.valueOf(dataArray[1]))) {
            mathSymbol = MathSymbol.getMathSymbol(String.valueOf(dataArray[1]));
        } else {
            throw new InputException("Invalid input. Try again");
        }
   }
    public static int getFirstElement() {
        return firstElement;
    }

    public static int getSecondElement() {
        return secondElement;
    }

    public static String getMathSymbol() {
        return mathSymbol;
    }

    public static boolean isAreNumbersArabic() {
        return areNumbersArabic;
    }
}
