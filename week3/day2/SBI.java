package week3.day2;

public class SBI implements RBI,RBI1 {

	public void withdrawals() {
		System.out.println("information pass if customer taking above 10L");	
	}

	public void kyc() {
		
	System.out.println("for kyc Pan mandatory");	
	}

	
	public void mindeposit() {
		System.out.println("5000rs");
	}
	
	public static void main(String[] args) {
		SBI sbi=new SBI();
		
		sbi.kyc();
		sbi.mindeposit();
		sbi.withdrawals();
		
		//RBI rbi=new RBI();
		//for interface we cannot create object
		
	}

	public void cod() {
		// TODO Auto-generated method stub
		
	}

	public void zerobalance() {
		// TODO Auto-generated method stub
		
	}
}
