package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BeakJoon28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        while (count < n) {
            String[] arr = br.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                int x = Integer.parseInt(arr[i]);
                switch (x) {
                    case 1: {
                        stack.push(x);
                        break;
                    }
                    case 2: {
                        if (stack.isEmpty()) {
                            System.out.println(-1);
                        }else{
                            stack.pop();
                        }
                        break;
                    }
                    case 3: {
                        System.out.println(stack.size());
                        break;
                    }
                    case 4: {
                        System.out.println(stack.isEmpty() ? 1 : 0);
                        break;
                    }
                    case 5: {
                        if (stack.isEmpty()) {
                            System.out.println(-1);
                        }else{
                            System.out.println(stack.pop());
                        }
                        break;
                    }
                }
            }

            count--;
        }
    }

}
