package main_2;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class J_2_6_6 {
	public static void main(String[] args) throws IOException {
		String msg ="第１土曜日は資源ごみ回収です。";
		Reader sr = new StringReader(msg);
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
	}

}
