package calcRun;

import java.util.List;

public class CalculatorRunner {
    public static void main(String[] args) throws InputException {

        List<String> userData = InputReader.readInputData();

        String result = Calculation.calculate(userData);

        System.out.printf(result);
    }
}

