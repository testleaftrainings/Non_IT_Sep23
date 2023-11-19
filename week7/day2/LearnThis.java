package week6.day2;

public class LearnThis {
//variable level
	String companyName;
	
	public void print() {
		String companyName = "Qeagle";
		System.out.println(companyName);
	}
	//method level
	public void run() {
		this.print();
	}
	//Create constructor
	public LearnThis(String companyName) {
		this.companyName=companyName;
	}
	public static void main(String[] args) {
		LearnThis obj =new LearnThis("Testleaf");
		System.out.println(obj.companyName);
		obj.run();
		
	}
}
