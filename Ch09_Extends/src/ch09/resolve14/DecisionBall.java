package ch09.resolve14;

import java.util.Arrays;

public class DecisionBall {
    public static void determineResult(int[] generatedNums, int[] guessedNums) {
        int strikes = 0;
        int balls = 0;

        for (int i = 0; i < 3; i++) {
            if (generatedNums[i] == guessedNums[i]) {
                strikes++;
            } else if (Arrays.asList(guessedNums).contains(generatedNums[i])) {
                balls++;
            }
        }

        System.out.println("==> " + strikes + " 스트라이크, " + balls + " 볼");

        if (strikes == 3) {
            System.out.println("==> 스트라이크");
        }
    }
}