package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeakJoon3003 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};
        for (int n : chess) {
            System.out.print(n - (Integer.parseInt(st.nextToken())) + " ");
        }
    }
}
