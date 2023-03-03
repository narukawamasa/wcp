package main_2;

import java.io.FileWriter;
import java.io.IOException;

public class J_2_6_5 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("c:\\rpqsave.dat", true);
		) {
			
			fw.write("A");
			fw.flush();
		} catch (IOException e) {
			System.out.println("ファイルの読み込みエラーです");
		} 
	}

}
