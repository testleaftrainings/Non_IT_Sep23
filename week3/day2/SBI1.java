package week3.day2;

public class SBI1 extends SBIHQ{

	public void zerobalance() {
		System.out.println("its for salary person");
		
	}

	@Override
	public void personalLoan() {
	System.out.println("roi 7.6%");
		
	}
	
	
	public static void main(String[] args) {
		
		SBI1 sbi=new SBI1();
		sbi.kyc();
		sbi.withdrawals();
		sbi.zerobalance();
		sbi.personalLoan();
	}

}
