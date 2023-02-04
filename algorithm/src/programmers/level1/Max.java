package programmers.level1;

import java.util.Arrays;

public class Max {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		return Math.max((numbers[0]*numbers[1]), numbers[numbers.length-1]*numbers[numbers.length-2]);
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, -3, 4, -5 };
		Max m = new Max();
		System.out.println(m.solution(numbers));
	}
}
