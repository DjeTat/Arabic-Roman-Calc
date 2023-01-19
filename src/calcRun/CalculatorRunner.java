package calcRun;

public class CalculatorRunner {
    public static void main(String[] args) throws InputException {

        String inputParameters = InputReader.readInputData();

        String result = Calculation.getResult();

        System.out.println(result);
    }
}

