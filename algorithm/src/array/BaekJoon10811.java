package array;
// BeakJoon 10811 바구니 뒤집기
// 문제
// 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
// 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ...,
// 가장 오른쪽 바구니를 N번째 바구니라고 부른다. ex) 1,2,3,...,N
// 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다.
// 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
// 바구니의 순서는 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음,
// 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는  프로그램을 작성하시오.

// 입력
// 첫째 줄에 N(1<= N <= 100)과 M(1 <= M <= 100)이 주어진다.
// 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다.
// 방법은 i j로 나타내고, 왼쪽으로 부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다.
// 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

// 출력
// 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀져있는 순서를 공백으로 구분해 출력.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 바구니 N개
		int N = Integer.parseInt(st.nextToken());
		// M번 횟수만큼 바구니 순서를 변경
		int M = Integer.parseInt(st.nextToken());
		int [] basket = insertBasket(N);
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) -1;
			int end = Integer.parseInt(st.nextToken()) -1;
			changeBasketNum(basket, start, end);
		}
        System.out.println(printBasket(basket));
		
	}
	private static void changeBasketNum(int[] basket, int start, int end) {
		while(start < end){
            int temp = basket[start];
            basket[start] = basket[end];
            basket[end] = temp;
            start++;
            end--;
        }
	}
	private static int[] insertBasket(int n) {
		int[] basket = new int[n];
		for(int i = 0; i < basket.length; i++) {
			basket[i] = i+1;
		}
		return basket;
	}
    private static String printBasket (int[] basket){
        String answer = "";
        for(int val : basket){
            answer +=val;
            answer +=" ";
        }
        return answer;
    }
}
