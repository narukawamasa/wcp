package main_2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class J_2_6_7 {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
		for (byte b : data) {
			System.out.println(b);
		}
	}

}
