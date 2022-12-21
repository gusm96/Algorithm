package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// BubbleSort 거품정렬
// Selection Sort 와 유사한 Algorithm
// 단점으로 시간복잡도가 최악, 최선, 평균 모두 o(n^2) 로 비효율적이다.
public class BubbleSort {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[Integer.parseInt(br.readLine())];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		bubbleSort(arr);
	}
	public static void bubbleSort (int [] arr) {
		int temp =0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length -1; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
