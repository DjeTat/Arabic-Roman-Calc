package calcRun;

import java.util.HashMap;

public class DataValidation {
    String[] dataArray;
    int firstElement;
    int secondElement;
    char mathSymbol;
    private boolean isFirstRoman;
    private boolean isFirstArabic;

    public void checkElements(String userData) throws InputException {
        dataArray = InputReader.userData.toUpperCase().split(" ");

        if (dataArray.length != 3) {
            throw new InputException("Invalid input. Try again");
        }

        HashMap<String, Integer> romanSymbols = new HashMap<>();
        romanSymbols.put("I", 1);
        romanSymbols.put("II", 2);
        romanSymbols.put("III", 3);
        romanSymbols.put("IV", 4);
        romanSymbols.put("V", 5);
        romanSymbols.put("VI", 6);
        romanSymbols.put("VII", 7);
        romanSymbols.put("VIII", 8);
        romanSymbols.put("IX", 9);
        romanSymbols.put("X", 10);

        HashMap<String, Integer> arabicSymbols = new HashMap<>();
        arabicSymbols.put("1", 1);
        arabicSymbols.put("2", 2);
        arabicSymbols.put("3", 3);
        arabicSymbols.put("4", 4);
        arabicSymbols.put("5", 5);
        arabicSymbols.put("6", 6);
        arabicSymbols.put("7", 7);
        arabicSymbols.put("8", 8);
        arabicSymbols.put("9", 9);
        arabicSymbols.put("10", 10);

        HashMap<String, Character> mathSymbols = new HashMap<>();
        mathSymbols.put("+", '+');
        mathSymbols.put("-", '-');
        mathSymbols.put("*", '*');
        mathSymbols.put("/", '/');
        mathSymbols.put("^", '^');

        if (romanSymbols.containsKey(String.valueOf(dataArray[0]))) {
            isFirstRoman = true;
            firstElement = romanSymbols.get(dataArray[0]);
        } else if (arabicSymbols.containsKey(String.valueOf(dataArray[0]))) {
            isFirstArabic = true;
            firstElement = arabicSymbols.get(dataArray[0]);
        } else {
            throw new InputException("Incorrect input. Try again");
        }

        if (romanSymbols.containsKey(String.valueOf(dataArray[2]))) {
            if (isFirstRoman) {
                secondElement = romanSymbols.get(dataArray[2]);
            } else {
                throw new InputException("Incorrect input. Both numbers should be Arabic");
            }
        } else if (arabicSymbols.containsKey(String.valueOf(dataArray[2]))) {
            if (isFirstArabic) {
                secondElement = arabicSymbols.get(dataArray[2]);
            } else {
                throw new InputException("Incorrect input. Both numbers should be Roman");
            }
        } else {
            throw new InputException("Invalid input. Try again");
        }

        if (mathSymbols.containsKey(String.valueOf(dataArray[1]))) {
            mathSymbol = mathSymbols.get(dataArray[1]);
        } else {
            throw new InputException("Incorrect input. Enter required math symbols");
        }
    }
}
