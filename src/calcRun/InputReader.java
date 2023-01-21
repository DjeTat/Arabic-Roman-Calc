package calcRun;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputReader {
    public static List<String> readInputData() {

        Scanner input = new Scanner(System.in);
        System.out.println("""

                Enter your data for calculating using Arabic or Roman numbers from 1 to 10 and math symbols (+ - / * ^).
                Separate your input by a space:\s""");
        String userData = input.nextLine();
        input.close();

        return Arrays.stream(userData.toUpperCase().split(" ")).toList();
    }
}
