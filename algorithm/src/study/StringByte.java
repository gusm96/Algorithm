package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringByte {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String st = br.readLine();
		System.out.println("그냥 length = " + st.length());
		System.out.println("Byte = " + st.getBytes().length);
	}

}
