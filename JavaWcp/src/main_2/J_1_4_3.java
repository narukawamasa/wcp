package main_2;

import java.util.Iterator;
import java.util.Properties;

public class J_1_4_3 {
	public static void main(String[] args) {
		System.out.print("利用中のJavaバージョン:");
		System.out.println(System.getProperty("java.version"));
		
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("システムプロパティ一覧");
		while (i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
	}
}
