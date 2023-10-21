package week3.day1;

public class CarP extends VehicleGP{

	public void gear() {
		System.out.println("check with Gear is Running P");
	}
	
	public static void main(String[] args) {
		CarP c=new CarP();
		c.breaks();
		c.horn();
		c.gear();
	}
}
