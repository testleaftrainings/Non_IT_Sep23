package week6.day2;

public class LearnConstructor {
	int num;
	String name;
	boolean isCharge;
	float balance;

	// syntax
	public LearnConstructor() {
     System.out.println("default Constructor");
	}

	public LearnConstructor(int num ,String name) {
      System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
		// Create object
		LearnConstructor obj = new LearnConstructor(); // default
		LearnConstructor parameter = new LearnConstructor(10, "Testleaf");
		System.out.println(obj.num);
		System.out.println(obj.name);
		System.out.println(obj.isCharge);
		System.out.println(obj.balance);
	}

}
