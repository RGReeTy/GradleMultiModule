package by.mjc.util;

public class Util {

    public boolean isAllPositiveNumbers(String... strings) {
        StringUtils checkerNumbers = new StringUtils();

        for (String item : strings) {
            if (!checkerNumbers.isPositiveNumber(item)) {
                return false;
            }
        }

        return true;
    }
}
