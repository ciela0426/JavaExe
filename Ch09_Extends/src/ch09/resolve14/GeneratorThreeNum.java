package ch09.resolve14;

import java.util.Random;

public class GeneratorThreeNum {
    public static int[] generateThreeNum() {
        Random random = new Random();
        int[] threeNum = new int[3];
        for (int i = 0; i < 3; i++) {
            threeNum[i] = random.nextInt(10);
        }
        return threeNum;
    }
}
