package programmers.level1;

import java.util.Arrays;

public class Average {
	 public double solution(int[] arr) {
	        double answer = 0;
	        for(int val : arr)
	        	answer += val;
	        answer = answer / arr.length;
	        return answer;
	    }
	 
	 public double solution2(int[] arr) {
		 return Arrays.stream(arr).average().getAsDouble();
	 }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Average avg = new Average();
		System.out.println(avg.solution(arr));
		System.out.println(avg.solution2(arr));
	}
}
