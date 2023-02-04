package programmers.level1;

import java.util.HashMap;

public class StringCount {
	boolean solution(String s) {
		boolean answer = true;
		HashMap<String, Integer> map = new HashMap<>();
		map.put("p", 0);
		map.put("y", 0);
		String str = s.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			String st = String.valueOf(str.charAt(i));
			if (map.containsKey(st)) {
				map.put(String.valueOf(str.charAt(i)), map.getOrDefault(String.valueOf(str.charAt(i)), 0) + 1);
			}
		}
		if (map.get("p") != map.get("y")) {
			answer = false;
		} else if (map.get("p") == 0 && map.get("y") == 0) {
			answer = true;
		}
		return answer;
	}

	public static void main(String[] args) {
		StringCount sc = new StringCount();
		System.out.println("=====================================\n" + sc.solution("pPoooyY"));
	}
}
