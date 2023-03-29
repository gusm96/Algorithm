package baekjoon.ifelse;


//1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�. 
//���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
//���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
//��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
//���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. 
//�� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�.
//3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
//3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Dice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int m = 0;
		int[] num = new int[] { a, b, c };
		int max = num[0];
		if (a == b && b == c) {
			m = 10000 + (a * 1000);
		} else if (a == b && a != c) {
			m = 1000 + (a * 100);
		} else if (a == c && a != b) {
			m = 1000 + (a * 100);
		} else if (b == c && b != a) {
			m = 1000 + (b * 100);
		} else {
			for (int i = 0; i < num.length; i++) {
				if (max < num[i]) {
					max = num[i];
				}
			}
			m = max * 100;
		}
		System.out.print(m);
	}
}
