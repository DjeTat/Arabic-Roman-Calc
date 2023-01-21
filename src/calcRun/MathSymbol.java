package calcRun;

import java.util.List;

public class MathSymbol {

    private static final List<String> MATH_SYMBOL = List.of("+", "-", "/", "*", "^");

    public static boolean isMathSymbolValid(List<String> userData) {
        return MATH_SYMBOL.contains(userData.get(1));
    }
}
