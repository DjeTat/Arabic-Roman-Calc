package calcRun;

public class CalculatorRunner {
    public static void main(String[] args) throws InputException {

        InputReader.readInputData();

        DataValidation.checkElements();

        Calculation.calculate();

        if (DataValidation.isAreNumbersArabic()) {
            System.out.printf("%,d", Calculation.getResultArabic());
        } else {
            ConverterToRoman.getRomanNumber();
            System.out.println(ConverterToRoman.getResultRoman());
        }
    }
}

