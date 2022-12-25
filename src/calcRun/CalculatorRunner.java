package calcRun;

public class CalculatorRunner {
    public static void main(String[] args) throws InputException {

        InputReader.getInputData();

        DataValidation.checkElements();

        Calculation.calculate();

        if (DataValidation.isFirstArabic) {
            System.out.println(Calculation.resultArabic);
        } else {
            ConverterToRoman.getRomanNumber();
            System.out.println(ConverterToRoman.resultRoman);
        }
    }
}

