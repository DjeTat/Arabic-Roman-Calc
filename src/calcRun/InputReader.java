package calcRun;

import java.util.Scanner;

public class InputReader {
    static String userData;
    public static String getInputData() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter your data for calculating using Arabic or " +
                "Roman numbers from 1 to 10 and math symbols (+ - / * ^).\nSeparate your input by a space: ");
        userData = input.nextLine();
        input.close();
        return userData;
    }
}
