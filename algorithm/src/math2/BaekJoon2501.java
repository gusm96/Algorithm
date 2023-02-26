package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
			// N의 약수의 K번째 수가 존재하면 K번째 약수 출력
			if (count == k) {
				System.out.println(i);
				break;
			}
		}
		if (count < k)
			System.out.println(0);
	}
}
