package study;

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
	public void quickSort(int[] array, int left, int right) {
		 if(left >= right) return;
		    
		    // 분할 
		    int pivot = partition(array, left, right); 
		    
		    // 피벗은 제외한 2개의 부분 배열을 대상으로 순환 호출
		    quickSort(array, left, pivot-1);  // 정복(Conquer)
		    quickSort(array, pivot+1, right); // 정복(Conquer)
		    }

	public int partition(int[] array, int left, int right) {
		 /**
	    // 최악의 경우, 개선 방법
	    int mid = (left + right) / 2;
	    swap(array, left, mid);
	    */
	    
	    int pivot = array[left]; // 가장 왼쪽값을 피벗으로 설정
	    int i = left, j = right;
	    
	    while(i < j) {
	        while(pivot < array[j]) {
	            j--;
	        }
	        while(i < j && pivot >= array[i]){
	            i++;
	        }
	      //  swap(array, i, j);
	    }
	    array[left] = array[i];
	    array[i] = pivot;
	    
	    return i;
	    }
}
