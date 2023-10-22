package week3.day2;

public abstract class SBIHQ implements RBI{

	public void withdrawals() {
		System.out.println("its coming Abstract class");
	}

	public void kyc() {
		System.out.println("its coming Abstract class");

	}
	
	//abstract class i need use atleast one abstract method

	public  abstract void personalLoan();
	
	//0 to 100% abstract method 
	//both implement and unimplement
	//withd,kyc
	//zerobalance
	public static void main(String[] args) {
	//	SBIHQ hq=new SBIHQ();
		//abstract class also we cannot create object
	}
}
