package main_2;

public class J_1_2_3 {
	public static void main(String[] args) {
		Pocket<String> p = new Pocket<>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}

}
