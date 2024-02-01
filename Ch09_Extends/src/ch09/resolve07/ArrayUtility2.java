package ch09.resolve07;

import java.util.Arrays;

public class ArrayUtility2 {
	
	// s1과 s2를 연결한 새로운 배열 리턴
    public static int[] concat(int[] s1, int[] s2) {
        int[] result = new int[s1.length + s2.length]; // 새로운 배열 생성(길이 = s1 배열길이 + s2 배열길이)
        
        int index = 0;

        // result 에 s1의 요소 복사
        // for 루프가 반복될 때마다 s1의 요소가 result 배열에 할당
        for (int value : s1) {
            result[index++] = value;
        }

        // result 에 s2의 요소 복사
        for (int value : s2) {
            result[index++] = value;
        }

        return result;
    }

    // s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
    public static int[] remove(int[] s1, int[] s2) {
        int[] result = Arrays.copyOf(s1, s1.length);

        for (int num : s2) {
            result = removeElement(result, num);
        }

        return result;
    }

    private static int[] removeElement(int[] array, int element) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            return newArray;
        } else {
            return array;
        }
    }
}
