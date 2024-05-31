package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon10988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int result = 1;
        if(str.length == 1) {
            result = 1;
        } else if (str.length == 2) {
            result = str[0].equals(str[1]) ? 1 : 0;
        }else{
            for (int i = 0; i < str.length / 2; i++) {
                if (!str[i].equals(str[str.length - 1 - i])) {
                    result = 0;
                }
            }
        }
        System.out.println(result);
    }
}