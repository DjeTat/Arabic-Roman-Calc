package calcRun;

public class CalculatorRunner {

    public static void main(String[] args) throws InputException {

        String userData = InputReader.getInputData();

        DataValidation validation = new DataValidation();
        validation.checkElements(userData);

    }
}

