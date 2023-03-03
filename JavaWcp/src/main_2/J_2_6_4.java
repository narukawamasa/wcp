package main_2;

import java.io.FileWriter;
import java.io.IOException;

public class J_2_6_4 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:\\rpqsave.dat", true);
			fw.write("A");
			fw.flush();
		} catch (IOException e) {
			System.out.println("ファイルの読み込みエラーです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e2) {}
			}
		}
		
		
		
	}

}
