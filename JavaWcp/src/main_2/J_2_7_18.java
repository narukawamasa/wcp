package main_2;

import java.io.IOException;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class J_2_7_18 {
	public static void main(String[] aegs) throws IOException {
		try (ZipFile file = new ZipFile("rpg.jar")) {
			for (ZipEntry e : Collections.list(file.entries())) {
				System.out.println(e.getName() + "size=" + e.getCompressedSize());
			}
		}
	}

}
