package programmers.level1.bruteForce;

public class MinimumRectangle {
	public int solution(int[][] sizes) {
		int answer = 0;
		int maxW = 0, maxH = 0;
		for (int i = 0; i < sizes.length; i++) {
			maxW = Math.max(maxW, Math.max(sizes[i][0], sizes[i][1]));
			maxH = Math.max(maxH, Math.min(sizes[i][0], sizes[i][1]));
		}
		answer = maxW * maxH;
		return answer;
	}

	public static void main(String[] args) {
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		MinimumRectangle mr = new MinimumRectangle();
		System.out.println(mr.solution(sizes));
	}
}
