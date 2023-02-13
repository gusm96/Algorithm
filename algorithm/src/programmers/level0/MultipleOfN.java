package programmers.level0;

import java.util.Arrays;

public class MultipleOfN {
	public int[] solution(int n, int[] numlist) {
		return Arrays.stream(numlist).filter(val -> val % n == 0).toArray();
	}

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		MultipleOfN mn = new MultipleOfN();
		System.out.println(mn.solution(n, numlist));
	}
}
