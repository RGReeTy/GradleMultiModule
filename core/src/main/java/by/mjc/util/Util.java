package by.mjc.util;

import java.util.Arrays;

public class Util {

    public boolean isAllPositiveNumbers(String... strings) {
        StringUtils checkerNumbers = new StringUtils();

        return Arrays.stream(strings).allMatch(checkerNumbers::isPositiveNumber);
    }
}
