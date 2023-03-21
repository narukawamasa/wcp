package main.j_13;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return this.name;
	}
	public double isPower() {
		return this.power;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が短い。処理を中断");
		}
		this.name = name;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException("範囲外の数値。処理を中断");
		}
		this.power = power;
	}

}
