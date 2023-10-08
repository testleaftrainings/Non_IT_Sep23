package week1.day2;

public class LearnMethod {
	
	private void driveCar() {
		System.out.println("Driving the car");

	}
	
	public boolean soundHorn() {
		boolean var=true;
		System.out.println(var);
		return var;
		
	}
	public int add(int a,int b,String name ) {
		System.out.println(a+b);
		return a;
	}
	

	public static void main(String[] args) {
		//create object for the class
		LearnMethod obj =new LearnMethod(); 
		obj.soundHorn();
		obj.driveCar();
		obj.add(10, 20, "Testleaf");

	}

}
