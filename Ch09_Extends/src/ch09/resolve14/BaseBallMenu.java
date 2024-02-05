package ch09.resolve14;

import java.util.Scanner;

public class BaseBallMenu {
    public static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int[] guessedNums = new int[3];

        System.out.print("첫번째 숫자를 입력하시오 >> ");
        guessedNums[0] = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하시오 >> ");
        guessedNums[1] = scanner.nextInt();

        System.out.print("세번째 숫자를 입력하시오 >> ");
        guessedNums[2] = scanner.nextInt();

        return guessedNums;
    }

    public static boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("다시하시겠습니까? (Y/N)? ");
        char choice = scanner.next().charAt(0);
        return (choice == 'Y' || choice == 'y');
    }
}
