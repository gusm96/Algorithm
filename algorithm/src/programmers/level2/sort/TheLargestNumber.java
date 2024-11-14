package programmers.level2.sort;

/*
* 문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	"6210"
[3, 30, 34, 5, 9]	"9534330"
*/

import java.util.Arrays;

public class TheLargestNumber {
    public static String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        // numbers의 원소들을 String 값으로 변환
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        // 핵심 포인트 compareTo()
        // 두 수를 합친 값이 큰 순서대로 (내림차순)
        // n1 = 30, n2 =  34 이면 3034와 3430 중 뭐가 더 큰지 비교
        Arrays.sort(arr, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));

        // StringBuilder를 사용하여 문자열 조합
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }

        // 모든 원소가 0인 경우 처리
        // 즉, [0, 0, 0]인 경우 결과 값이 "000"이 되기 때문에 "0"으로 반환
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }
}
