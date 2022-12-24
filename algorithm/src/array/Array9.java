package array;
// BaekJoon 4344 평균은 넘겠지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
// 당신은 그들에게 슬픈 진실을 알려줘야한다.

// 입력
// 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
// 둘쨰 줄부터 각 테스트 케이스마다 학생의 수 N이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
// 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

// 출력
// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
public class Array9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] students = new String[Integer.parseInt(br.readLine())];
		StringTokenizer st;
		for (int i = 0; i < students.length; i++) {
			students[i] = br.readLine();
		}
		for (int i = 0; i < students.length; i++) {
			st = new StringTokenizer((students[i]), " ");
			int n = Integer.parseInt(st.nextToken());
			double sum = 0;
			double avg = 0;
			double count = 0;
			double[] arr = new double[n];
			;
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			avg = sum / n;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}
			avg = count / n * 100;
			System.out.println(String.format("%.3f", avg) + "%");
		}
	}
}
