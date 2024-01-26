package ch03.for10;

import java.util.Scanner;

//3. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
//삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
public class Resolve3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3개의 정수 입력받기
        System.out.print("첫 번째 변의 길이를 입력하세요 : ");
        int side1 = sc.nextInt();

        System.out.print("두 번째 변의 길이를 입력하세요 : ");
        int side2 = sc.nextInt();

        System.out.print("세 번째 변의 길이를 입력하세요 : ");
        int side3 = sc.nextInt();

        // 3각형 만들어지는지 확인
        boolean isTriangle = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);

        // 결과
        String result = isTriangle ? "삼각형을 만들 수 있다." : "삼각형을 만들 수 없다.";
        System.out.println(result);

        sc.close();
    }
}