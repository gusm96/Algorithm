package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[Integer.parseInt(br.readLine())];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		insertionSort(arr);
	}
	
	public static void insertionSort(int [] arr) {
		for(int index = 1; index < arr.length; index++) {
			// 2번째 index 값을 temp 에 저장한다.
			int temp = arr[index];
			// 1번째 index 값
			int prev = index -1;
			while((prev >= 0) && (arr[prev] > temp)) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
