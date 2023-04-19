package programmers.level0;

import java.util.Arrays;

public class CloseNumber {
    public int solution(int[] array, int n) {
        int answer = 0;
        // array 배열의 길이가 1일경우 array[0] 을 return
        if(array.length == 1) return array[0];
        // 배열을 정렬해준다.
        Arrays.sort(array);
        for(int i = 0; i < array.length-1; i++){
            if(array[i] == n) return array[i];
            int temp = Math.max(array[i], n) - Math.min(array[i], n);
            for(int j = i+1; j < array.length; j++){
                if (temp > (Math.max(array[j], n) - Math.min(array[j], n))) {
                    temp = Math.max(array[j], n) - Math.min(array[j], n);
                    answer = array[j];
                } else if (temp == Math.max(array[j], n) - Math.min(array[j], n)) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CloseNumber cn  = new CloseNumber();
        int[] array = {3, 10, 28};
        int n = 20;
        System.out.println(cn.solution(array, n));
    }
}
