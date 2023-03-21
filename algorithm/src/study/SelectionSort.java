package study;
import java.util.Arrays;

// SelectionSort 선택정렬
// Bubble Sort 와 유사한 Algorithm
// 해당 순서에 원소를 넣을 위치는 이미 정해져 있고,
// 어떤 원소를 넣을지 선택하는 Algorithm

// Process
// 1. 주어진 배열 중에 최소값을 찾는다.
// 2. 그 값을 맨 앞에 위치한 값과 교체한다.
// 3. 맨 처음 위치를 뺀 나머지 배열을 같은 방법으로 교체한다.

public class SelectionSort {
	public static void main(String[] args){
		int[] arr = {3, 12, 2, 1, 27, 32, 58};
		System.out.println(selectionSort(arr));
	}
	private static String selectionSort(int[] arr) {
		int indexMin, temp;
		for(int i = 0; i < arr.length-1; i++) {
			indexMin = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[indexMin]) {
					indexMin = j;
				}
			}
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		return Arrays.toString(arr);
	}
}
// 장점
// 알고리즘이 단순
// 정렬을 위한 비교 횟수는 많지만, Bubble Sort에 비해 실제로 교한하는 횟수는 적기 때문에
// 많은 교환이 일어나야 하는 자료상태에서 비교적 효율적이다.
// 정렬하고자 하는 배열 안에서 교환하는 방식이므로, 다른 메모리 공간을 필요로 하지 않는 장점

// 단점
// Bubble Sort 와 동이랗게 시간복잡도가 O(n^2)로 비효율적이다.
// 불안정 정렬(Unstable Sort) 이다.
