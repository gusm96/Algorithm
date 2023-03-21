package study;

import java.util.Arrays;

// BubbleSort 거품정렬
// Selection Sort 와 유사한 Algorithm
// 단점으로 시간복잡도가 최악, 최선, 평균 모두 o(n^2) 로 비효율적이다.
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {52,4,8,29,32,1};
		System.out.println(bubbleSort(arr));
		
	}
	private static String bubbleSort(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return Arrays.toString(arr);
	}
}
