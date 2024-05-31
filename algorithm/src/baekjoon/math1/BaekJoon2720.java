package baekjoon.math1;

import java.io.*;

public class BaekJoon2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 쿼터 $0.25 => 25센트
        // 다임 $0.10 => 10센트
        // 니켈 $0.05 => 5센트
        // 페니 $0.01 => 1센트
        // 거스름돈은 항상 $5.00 이하
        // 손님이 받는 동전의 개수를 최소로 하려고 한다.

        // 테스트 케이스 T
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int quarter = 0, dime = 0, nickel = 0, penny = 0;
            int n = Integer.parseInt(br.readLine());
            while (n > 0) {
                if (n >= 25) {
                    quarter = n / 25;
                    n %= 25;
                } else if (n >= 10) {
                    dime = n / 10;
                    n %= 10;
                } else if (n >= 5) {
                    nickel = n / 5;
                    n %= 5;
                } else {
                    penny = n / 1;
                    n %= 1;
                }
            }
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
