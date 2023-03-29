package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BaekJoon 11720 숫자의 합

// 문제
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 숫자의 개수 N이 주어진다.
// 둘째 줄에 숫자 N개가 공백없이 주어진다.

// 출력
// 입력으로 주어진 숫자 N개의 합을 출력한다.
public class BaekJoon11720 {
 public static void main (String [] args)throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int [] arr = new int[Integer.parseInt(br.readLine())];
	 String [] strArray = br.readLine().split("");
	 int count = 0;
	 for (int i = 0; i < arr.length; i++) {
		 arr[i] = Integer.parseInt(strArray[i]);
		 if(arr[i] != 0) {
			 count += arr[i];
		 }
	 }
	 System.out.println(count);
 }
}
