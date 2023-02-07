package programmers.level1;
import java.util.HashMap;
public class MostFrequentValue {
	public int solution(int[] array) {
		if(array.length == 1) return array[0];
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i])){
				map.put(array[i], map.getOrDefault(array[i], 0)+1);
			}else {
				map.put(array[i], 1);
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		int [] array = {1,2,3,3,3,4};
		MostFrequentValue mfv = new MostFrequentValue();
		System.out.println(mfv.solution(array));
	}
}
