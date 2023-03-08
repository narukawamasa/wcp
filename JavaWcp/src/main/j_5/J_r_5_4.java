package main.j_5;

public class J_r_5_4 {
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		System.out.println("三角形の底辺:10.0cm、高さ:5.0cmの面積は" + calcTriangleArea(bottom, height));
		System.out.println("円の半径が5.0cmの面積は" + calcCircleArea(radius));
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
