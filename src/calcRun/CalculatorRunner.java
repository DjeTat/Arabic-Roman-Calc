package calcRun;

import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter your data for calculating using Arabic or " +
                "Roman numbers from 1 to 10 and Math symbols (+ - / * ^).\nSeparate your input by a space: ");
        String calcData = input.nextLine();

    }
}

