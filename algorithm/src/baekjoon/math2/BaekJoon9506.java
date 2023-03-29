package baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaekJoon9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list;
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1)
				break;
			list = new ArrayList<>();
			for (int i = 1; i < n; i++) {
				if (n % i == 0)
					list.add(i);
			}
			int cnt = 0;
			for (int val : list)
				cnt += val;
			if (n == cnt) {
				System.out.print(n + " = 1");
				Collections.sort(list);
				for (int i = 1; i < list.size(); i++) {
					System.out.print(" + " + list.get(i));
				}
				System.out.println();
			} else {
				System.out.println(n + " is Not perfect.");
			}
		}
	}
}
