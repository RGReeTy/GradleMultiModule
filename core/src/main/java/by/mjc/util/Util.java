package by.mjc.util;

import java.util.Arrays;

public class Util {

    public boolean isAllPositiveNumbers(String... strings) {
        StringUtils numbersChecker = new StringUtils();

        return Arrays.stream(strings).allMatch(numbersChecker::isPositiveNumber);
    }
}
