package main_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class J_2_7_1 {
	public void saveHeroToFile(Hero h) throws IOException {
		Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
//		w.write(h.name + "\n");
//		w.write(h.hp + "\n");
//		w.wrire(h.mp + "\n");
		w.flush();
		w.close();
	}

}
