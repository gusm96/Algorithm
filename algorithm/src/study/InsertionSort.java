package study;

import java.util.Arrays;

// Insertion Sort 삽입 정렬
// Selection Sort와 유사하지만, 좀 더 효율적
// 2번쨰 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후,
// 원소를 뒤로 옮기고 지정된 자리에 자료를 삽입하여 정렬하는 Algorithm

// 시간복잡도 최선의 경우 O(N)이라는 엄청나게 빠른 효율성을 가지고 있다.

// Process
// 1. 정렬은 2번째 위치(index)의 값을 temp에 저장한다.
// 2. temp와 이전에 있는 원소들과 비교하여 삽입해나간다.
// 3. '1'번으로 돌아가 다음 위치(index)의 값을 temp에 저장하고, 반복한다.
public class InsertionSort {
	public static void main(String[] args){
		int [] arr = {24 , 32, 2, 52, 12, 8};
		System.out.println(insertionSort(arr));
	}
	
	private static String insertionSort(int [] arr) {
		for(int i = 1; i < arr.length; i++) { // 2번째 index 부터 시작
			int temp = arr[i]; // 임의로 해당 index 값 저장
			int prev = i-1; // 이전 index 저장
			int count = 1;
			System.out.println("temp = "+temp+"\nprev = "+arr[prev]);
			while((prev >= 0) && (arr[prev] > temp)) { //이전 index 가 0이상 이고 그 값이 임의로 저장된 temp값 보다 큰경우 while 문 실행
				arr[prev + 1] = arr[prev];
				prev--;
				System.out.println("while 횟수 = "+count);
				count ++;
			}
			arr[prev+1] = temp;
			System.out.println("arr[prev+1] = "+arr[prev+1]+"\n");
		}
		return Arrays.toString(arr);
	}
}
