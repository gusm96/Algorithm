package advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String star = "*";
		for (int i = 0; i < n; i++) {
			for(int j = i; j < n-1; j++) {
				sb.append(" ");
			}
			sb.append(star);
			sb.append("\n");
			star +="**";
		}
		String space = " ";
		star = star.substring(2);
		for (int i = 0; i < n-1; i++) {
			sb.append(space);
			space +=" ";
			star = star.substring(2);
			sb.append(star);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

