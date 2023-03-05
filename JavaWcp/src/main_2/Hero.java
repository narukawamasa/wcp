package main_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hero {
	public Hero loadHeroFromFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("rpgsave.dat"));
		
		String name = br.readLine();
		String hp = br.readLine();
		String mp = br.readLine();
		br.close();
		return new Hero(name,Integer.parseInt(hp), Integer.parseInt(mp));
	}
	
	String name;
	int hp;
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(
				this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
