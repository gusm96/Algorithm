package study;

import java.util.Arrays;

// Quick Sort 퀵정렬
// Quick Sort는 분할 정복(divide and conpuer)방법 을 통해 주어진 배열을 정렬한다.
// [분할 정복(divide and conpuer)방법 이란?]
// 문제를 작은 2개의 문제로 분리하고 각각을 해결한 다음,
// 결과를 모아서 원래의 문제를 해결하는 전략이다.

// Process
// 1. 배열 가운데서 하나의 원소를 고른다. 이렇게 고른 원소를 피벗(pivot)이라고 한다.
// 2. 피벗 앞에는 피벗보다 값이 작은 모든 원소들이 오고, 피벗 뒤에는 보다 값이 큰 모든 원소들이
//    오도록 피벗을 기준으로 배열을 둘로 나눈다. 이렇게 배열을 둘로 나누는 것을 분할(Divide)라고 한다.
//    분할을 마친 뒤에 피벗은 더 이상 움직이지 않는다.
// 3. 분할된 두 개의 작은 배열에 대해 재귀(Recursion)적으로 이 과정을 반복한다.
//  * 재귀 호출이 한번 진행될 때마다 최소한 하나의 원소는 최종적으로 위치가 정해지므로,
//    이 알고리즘은 반드시 끝난다는 것을 보장할 수 있다.

public class QuickSort {
	private static void quickSort(int[] arr) {
		// 재귀 함수 호출 시작 index 와 끝 index
		quickSort(arr, 0, arr.length-1);
	}
	private static void quickSort(int[] arr, int start, int end) {
		// 해당 배열방의 시작과 끝 영역 안에서 partition을 나눈다.
		int right = partition(arr, start, end); // 나눈 partition의 오른쪽 방 첫번째 값을 받아온다.
		// 오른쪽 partition이 시작점(start) 바로 다음에서 시작한다면 
		// 왼쪽 partition에 데이터가 하나뿐이라 정렬할 필요가 없다.
		// 그래서 오른쪽 partition에서 시작점에서 한개 이상 차이날 때만 재귀호출 진행
		if(start < right -1) {
			quickSort(arr, start, right -1);
		}
		// 그리고 오른쪽 partition의 시작점이 한개 이상일때만 호출해야해서
		// 오른쪽 partition의 시작점이 마지막 배열방 보다 작을 경우에만 오른쪽 partition 정렬하도록 한다.
		if(right < end) {
			quickSort(arr, right, end);
		}
	}
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end)/2]; // pivot 값은 배열의 중간 값으로 설정.
		// 시작점이 끝 지점보다 작거나 같은 경우에 반복문 실행
		while(start <= end) {
			// 배열의 start 값이 pivot 보다 작으면 pass
			while(arr[start]<pivot) start++;
			// 배열의 end값이 pivot 보다 크면 pass 
			while(arr[end] > pivot) end--;
			if(start <= end) {
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		return start;
	}
	private static void swap(int[] arr, int start , int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {3, 12, 7 ,23 , 58, 24, 42};
		System.out.println("정렬 전"+Arrays.toString(arr));
		quickSort(arr);
		System.out.println("\n정렬  후 "+Arrays.toString(arr));
	}
}
