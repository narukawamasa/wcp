public class Chapter07 {
    public static void main(String[] args) {
        int val = 8;
        if (val <= 5) {
            System.out.println("とても近いです");
        } else if (val <= 10) {
            System.out.println("近いです");
        } else if (val <=15) {
            System.out.println("遠いです");
        } else {
            System.out.println("とても遠いです");
        }
    }
}