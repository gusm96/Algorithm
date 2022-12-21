package function;

import java.io.IOException;

// BackJoon 15596 정수 N의 합

// 문제 
// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
// 작성해야 하는 함수는 다음과 같다.

public class Function1 {
	Long sum (int [] a) {
		long ans = 0;
		for(int val : a) {
			ans += val;
		}
		return ans;
	}
}
