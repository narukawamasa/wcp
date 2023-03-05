package main_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class J_2_7_2 {
	public void saveHeroToFile(Hero h) throws IOException {
		Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
//		w.write(h.name);
//		w.write(",");
//		w.write(h.hp);
//		w.write(",");
//		w.wrire(h.mp);
//		w.write(",");
		w.flush();
		w.close();
	}

}
