package main_2.j_7_r;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws Exception {
		Reader fr = new FileReader("pref.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("aichi.capital") + ":"
				+ p.getProperty("aichi.food"));
		fr.close();
	}

}
