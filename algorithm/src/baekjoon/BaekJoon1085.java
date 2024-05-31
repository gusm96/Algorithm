package baekjoon;

import java.io.*;

public class BaekJoon1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int w = Integer.parseInt(str[2]);
        int h = Integer.parseInt(str[3]);

        System.out.println(Math.min(Math.min((Math.max(x, w) - Math.min(x, w)), x)
                ,
                Math.min((Math.max(y, h) - Math.min(y, h)), y)
        ));
    }
}
