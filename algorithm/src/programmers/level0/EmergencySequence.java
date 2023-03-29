package programmers.level0;

import java.util.Arrays;

public class EmergencySequence {
	public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr = new int[emergency.length];
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = emergency[i];
        }
        // Arrays.sort 를 사용하지 않고 insertionSort Algorithm 이용
        insertionSort(arr); // 내림차순 정렬
        for(int val : arr) System.out.println(val);
        for(int i = 0; i < emergency.length; i++) {
        	for(int j = 0; j <emergency.length; j++) {
        		if(emergency[i] == arr[j]) {
        			answer[i] = j+1;
        		}
        	}
        }
        
        return answer;
    }
	public int[] insertionSort(int [] arr) {
		for(int i = 1; i < arr.length; i++) { // 2번째 index 부터 시작
			int temp = arr[i]; // 임의로 해당 index 값 저장
			int prev = i-1; // 이전 index 저장
			while((prev >= 0) && (arr[prev] < temp)) { //이전 index 가 0이상 이고 그 값이 임의로 저장된 temp값 보다 큰경우 while 문 실행
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev+1] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		EmergencySequence es = new EmergencySequence();
		int [] emergency = {3,76,24};
		System.out.println(Arrays.toString(es.solution(emergency)));
	}

}
