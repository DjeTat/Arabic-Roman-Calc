package calcRun;

import java.util.List;

public class MathSymbol {

    private static final List<String> MATH_SYMBOL = List.of("+", "-", "/", "*", "^");

    public static boolean isMathSymbolValid(String symbol) {
        return MATH_SYMBOL.contains(symbol);
    }

    public static String getMathSymbol(String symbol) {
        return symbol;
    }
}
