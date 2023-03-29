package programmers.level0;

public class Factorial {
	public int solution(int n) {
		int answer = 1;
		while (factorial(answer) <= n) {
			answer++;
		}
		return answer - 1;
	}

	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		int n = 3628800;
		System.out.println(f.solution(n));
	}
}
