package java4;

public class Taxi extends Vehicle{
  
  public Taxi(int crewNum){
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("タクシーの乗客：" + crewNum + "名");
  }
}
