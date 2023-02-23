package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class IntegerSequence {
	public long solution(long n) {
		long answer = 0;
		List<Long> list = new ArrayList<>();

		while (n != 0) {
			list.add(n % 10);
			n /= 10;
		}
		int max;
		long temp;
		for (int i = 0; i < list.size() - 1; i++) {
			max = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(max) < list.get(j)) {
					max = j;
				}
			}
			temp = list.get(max);
			list.set(max, list.get(i));
			list.set(i, temp);

		}
		int pow = list.size() - 1;
		for (long val : list) {
			answer += val * Math.pow(10, pow);
			pow--;
		}

		return answer;
	}

	public static void main(String[] args) {
		// 1 <= n <= 8,000,000,000 ;
		long n = 118372;
		IntegerSequence isq = new IntegerSequence();
		System.out.println(isq.solution(n));
	}
}
