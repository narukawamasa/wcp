package main.game;

public class Wand {
	
	private String name;
	private double power;
	
	public void setName(String name) {
		if (name.length() < 3 || name == null) {
			throw new IllegalArgumentException ("名前が短すぎる為、処理を中断。");
		}
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPower(double power) {
		if (0.5 > power || power > 100) {
			throw new IllegalArgumentException ("文字数制限よりも以下もしくは以上の為、処理を中断。");
		}
		this.power = power;
	}
	
	public double getPower() {
		return this.power;
	}

}
