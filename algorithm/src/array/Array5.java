package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BackJoon 5597 과제 안 내신 분..?

// 문제
// X대학 모교수님은 프로그래밍 수업을 맡고 있다.
// 교실엔 학생이 30명이 있는데. 학생 명부엔 각 학생별로 1번 부터 30번까지 출석번호가 붙어 있다.
// 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로개름을 작성하시오.

// 입력
// 입력은 총 28줄로 각 제출자의 출석번호n이 한 줄에 하나씩 주어진다.
// 출석번호에 중복은 없다.

// 출력
// 출력은 2줄이다.
// 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
public class Array5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] students = new int[30];
		int[] hw = new int[28];
		for (int i = 0; i < students.length; i++) {
			students[i] = i + 1;
		}
		for (int i = 0; i < hw.length; i++) {
			hw[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < students.length; i++) {
			for(int j = 0; j< hw.length; j++) {
				if(students[i] != hw[j]) {
					sb.append(students[i]).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
