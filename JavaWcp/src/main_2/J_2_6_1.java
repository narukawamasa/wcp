package main_2;

import java.io.FileWriter;
import java.io.IOException;

public class J_2_6_1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:\\rpqsave.dat", true);
		fw.write("A");
		fw.flush();
		fw.close();
		
	}

}
