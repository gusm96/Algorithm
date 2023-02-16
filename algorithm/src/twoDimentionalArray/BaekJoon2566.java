package twoDimentionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BaekJoon 2566 최댓값
public class BaekJoon2566 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int [][] arr = new int [9][9];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j< arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int max = arr[0][0];
		int [] result = new int[2];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					result[0] = i+1;
					result[1] = j+1;
				}
			}
		}
		for(int [] e : arr)
			for(int val : e)
				if(max == val)
					count++;
		
		System.out.println(max+"\n"+result[0]+" "+result[1]);
	}
}
