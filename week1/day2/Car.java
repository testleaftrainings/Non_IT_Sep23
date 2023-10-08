package week1.day2;

public class Car {
	//dataType variable  =value;
	byte numWheels=4;
	short noOfDoors=4;
	int modelNum=6732;
	float engineCapacity = 5.4f;
	double mileage=23.34d;
	char logo='S';
	boolean gearType=true;
	public static void main(String[] args) {
		//Creating object to access member of the class
		
		 Car obj =new Car();
		String brandName="SUV";
		System.out.println("No Of Wheels"+obj.numWheels);
		System.out.println(obj.logo);
		System.out.println(obj.engineCapacity);
		
		
	}

	
}
