package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String[] str = br.readLine().split(" ");
            Integer x = Integer.parseInt(str[0]);
            Integer y = Integer.parseInt(str[1]);
            if (!xList.contains(x)) {
                xList.add(x);
            } else {
                xList.remove(x);
            }
            if (!yList.contains(y)) {
                yList.add(y);
            } else {
                yList.remove(y);
            }
        }

        System.out.println(xList.get(0) + " " + yList.get(0));
    }
}
