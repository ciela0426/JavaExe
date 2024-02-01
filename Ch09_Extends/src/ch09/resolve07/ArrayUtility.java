package ch09.resolve07;

public class ArrayUtility {
	
	// int(정수)배열을 double(실수)배열로 변환
    public static double[] intToDouble(int[] intArr) {
        double[] result = new double[intArr.length]; // 새로운 실수 배열 생성(배열 길이 = 정수 배열 길이)

        for (int i = 0; i < intArr.length; i++) {
            result[i] = (double) intArr[i];
        }

        return result;
    }

    // double(실수)배열을 int(정수)배열로 변환
    public static int[] doubleToInt(double[] doubleArr) {
        int[] result = new int[doubleArr.length]; // 새로운 정수 배열 생성(배열 길이 = 실수 배열 길이)

        for (int i = 0; i < doubleArr.length; i++) {
            result[i] = (int) doubleArr[i];
        }

        return result;
    }
	
	
}
