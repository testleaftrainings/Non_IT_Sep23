package week3.day1;

public class BMWC extends CarP {

	public void sunRoof() {
		System.out.println("open the sunRoof C");
	}
	
	public void breaks() {
		System.out.println("Apply break from C");

	}
	
	public static void main(String[] args) {
		BMWC b=new BMWC();
		
		b.breaks();
		b.horn();
		b.gear();
		b.sunRoof();
		
		
	}
}
