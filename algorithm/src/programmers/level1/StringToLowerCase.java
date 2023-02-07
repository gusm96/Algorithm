package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class StringToLowerCase {
	public String solution(String s) {
		String answer = "";
		Integer[] arr = new Integer[s.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) s.charAt(i);
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for(int val : arr)
			answer += (char)val;
		return answer;
	}

	public static void main(String[] args) {
		String s = "Zbcdefg";
		StringToLowerCase stlc = new StringToLowerCase();
		System.out.println(stlc.solution(s));
	}
}
