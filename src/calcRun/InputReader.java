package calcRun;

import java.util.Scanner;
public class InputReader {
    private static String userData;
    public static void readInputData() {

        Scanner input = new Scanner(System.in);
        System.out.println("""

                Enter your data for calculating using Arabic or Roman numbers from 1 to 10 and math symbols (+ - / * ^).
                Separate your input by a space:\s""");
        userData = input.nextLine();
        input.close();
    }
    public static String getUserData() {
        return userData;
    }
}
