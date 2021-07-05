package Utils;

import java.util.Random;

public class CommonUtils {
    public static Integer generateRandomId() {
        return new Random().nextInt(10 - 1 + 1) + 1;
    }
}
