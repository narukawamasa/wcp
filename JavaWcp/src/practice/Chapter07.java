package practice;

public class Chapter07 {
	public static void main(String[] args) {
		int num = 8;
		if (num <= 5) {
			System.out.println("とても近いです");
		} else if (num <= 10) {
			System.out.println("近いです");
		} else if (num <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String col = "red";
		switch(col) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}

}
