package main_2;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class J_2_7_6 {
	public static void main(String[] args) throws Exception {
		Writer fw = new FileWriter("c:\\rpgdate.properties");
		Properties p = new Properties();
		p.setProperty("heroName", "アサカ");
		p.setProperty("heroHp", "62");
		p.setProperty("heroMp", "45");
		p.store(fw, "勇者の情報");
	    fw.close();
		
	}

}
