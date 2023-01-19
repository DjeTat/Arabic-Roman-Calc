package calcRun;

public class CalculatorRunner {
    public static void main(String[] args) throws InputException {

        InputReader.readInputData();

        DataConversion.checkElements();

        Calculation.calculate();

        if (DataConversion.isAreNumbersArabic()) {
            System.out.printf("%,d", Calculation.getResultArabic());
        } else {
            ConverterToRoman.getRomanNumber();
            System.out.println(ConverterToRoman.getResultRoman());
        }
    }
}

