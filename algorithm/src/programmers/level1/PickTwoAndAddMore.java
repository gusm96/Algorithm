package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class PickTwoAndAddMore {
    public int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};


    }
}
