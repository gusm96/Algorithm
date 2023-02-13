package programmers.level1;

import java.util.HashMap;

public class MostFrequentValue {
	public int solution(int[] array) {
		int answer = 0;
		if (array.length == 1)
			answer = array[0];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		int max = 0;
		int count = 0;
		for (int key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
			}
		}
		for (int val : map.values())
			if (max == val)
				count++;
		if (count > 1) {
			answer = -1;
		} else {
			for (int key : map.keySet()) {
				if (map.get(key) == max)
					answer = key;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] array = {0,1,2,2,1101,123,1332,123, 123};
		MostFrequentValue mfv = new MostFrequentValue();
		System.out.println(mfv.solution(array));
	}
}
