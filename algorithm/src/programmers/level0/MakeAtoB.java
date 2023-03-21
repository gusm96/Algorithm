package programmers.level0;

import java.util.Arrays;

public class MakeAtoB {
	public int solution(String before, String after) {
		int answer = 1;
		String[] a = after.split("");
		String[] b = before.split("");
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (!a[i].equals(b[i]))
				return 0;
		}
		return answer;
	}

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		MakeAtoB mab = new MakeAtoB();
		System.out.println(mab.solution(before, after));

	}
}
