package baekjoon.forEach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BaekJoon 25304

// 문제
// 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다.
// 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
// 준원이는 영수증을 보면서 정확하게 계산된 것이 맍는지 확인해보려 한다.

// 영수증에 적힌,
// 구매한 각 물건의 가격과 개수
// 구매한 물건들의 총 윽ㅁ액
// 을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
public class Receipt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int totalPrice = Integer.parseInt(br.readLine());
		int totalNum = Integer.parseInt(br.readLine());
		int recentPrice = 0;
		int p = 0;
		for (int i = 0; i < totalNum; i++) {
			recentPrice = p;
			st = new StringTokenizer(br.readLine(), " ");
			int price = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			p = (price * num) + recentPrice;
		}
		if (totalPrice == p) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
