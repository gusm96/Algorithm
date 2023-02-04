package programmers.level1;

public class Fraction {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		if (denom1 != denom2) {
			int a = (numer1 * denom2) + (denom1 * numer2); // 분자
			int b = denom1 * denom2; // 분모
			int max = eucd(a, b);
			answer[0] = a / max;
			answer[1] = b / max;
		} else {
			answer[0] = numer1 + numer2;
			answer[1] = denom1;
		}
		return answer;
	}

	// 최대 공약수를 구하는 유클리드 호재법
	private int eucd(int max, int min) {
		if (max % min == 0) {
			return min;
		} else {
			return eucd(min, max % min);
		}
	}

	public static void main(String[] args) {
		Fraction fr = new Fraction();
		System.out.println(fr.solution(1, 2, 3, 4));
		System.out.println(fr.solution(9, 2, 1, 3));
	}
}
