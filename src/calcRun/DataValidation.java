package calcRun;

import java.util.HashMap;

public class DataValidation {

    public void romanValidation() {
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


    }

    public void arabicValidation() {
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
    }

    public void mathSymbolsValidation() {
        HashMap<String, Character> mathSymbols = new HashMap<>();
        mathSymbols.put("+", '+');
        mathSymbols.put("-", '-');
        mathSymbols.put("*", '*');
        mathSymbols.put("/", '/');
        mathSymbols.put("^", '^');
    }

}
