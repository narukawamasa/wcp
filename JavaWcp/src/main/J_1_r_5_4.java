package main;

public class J_1_r_5_4 {
	public static void main(String[] args) {
		double bottom = 10.0;
		double heigth = 5.0;
		
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + heigth + "cmの場合、面積は" + calcTraingleArea(bottom, heigth) + "㎠");
		
		double radius = 5.0;
		
		System.out.println("円の半径が" + radius + "cmの場合は、面積は" + calcCircleArea(radius) + "㎠");
	}
	
	public static double calcTraingleArea(double bottom, double heigth) {
		return bottom * heigth / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
