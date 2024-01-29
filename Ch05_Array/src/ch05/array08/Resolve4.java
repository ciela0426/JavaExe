package ch05.array08;

import java.util.Arrays;

/*
4. 정수 배열 5개를 할당하고
   Arrays.sort를 사용하지 말고
   배열을 오름차순으로 정렬하도록 저장하세요.
   그리고 출력하세요.
 */
public class Resolve4 {
	public static void main(String[] args) {
		int[] numArr = {23,5,63,17,73};
		
		// bubble 정렬
		// 가장 단순하고 직관적인 정렬 알고리즘
		// 간단한 코드가 필요할 때에나 복잡도가 중요하지 않은 문제에서 사용
		// 인접한 두 원소를 비교(Compare)해 조건에 맞지 않다면 두 원소를 바꿔줌 (Swap)
		/*
		for (int i = 0; i < numArr.length - 1; i++) {
			boolean swap = false; // 정렬이 완료되었는데도 index때문에 돌아가는 것을 방지
			for (int j = 0; j < numArr.length - 1; j++) { // 맨 마지막 index 때문에 필요함
				
				if (numArr[j] > numArr[j + 1]) { // 바로 다음 원소와 비교
					int num = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = num;
					swap = true; // 오름차순을 진행한 경우 swap = true;
				}
			}
			if (!swap) { // 오름차순을 진행하지 않을 경우 이미 정렬된 배열이라는 의미이므로 break;
				break;
			}
		}
		*/
		
		// 선택 정렬 ( bubble 정렬보다 아주 조금 더 빠름 )
		// 배열에서 최솟값을 선택해 정렬되지 않은 배열의 첫번째 인덱스에 넣어주는 알고리즘
		// 크기가 작은 리스트를 정렬할 때, 모든 원소를 확인해야만 할 때 사용
		/*
		for (int i = 0; i < numArr.length - 1; i++) {
			int minIdx = i; // 교환용 index
			
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[j] < numArr[minIdx]) { // 값을 비교한 후 더 작으면 위치 변경
					minIdx = j;
				}
			}
			
			int temp = numArr[i]; // 가장 낮은 index에 최솟값 넣기
			numArr[i] = numArr[minIdx];
			numArr[minIdx] = temp;
		}
		*/
		
		
		// 삽입 정렬 ( 선택 정렬과 유사하지만 조금 더 효율적임 )
		/*
		
		*/
		
		System.out.println(Arrays.toString(numArr));
	}
}
