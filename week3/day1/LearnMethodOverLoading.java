package week3.day1;

public class LearnMethodOverLoading {

	public void add() {
		System.out.println(5+6);
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	//int,String
	public void add(int age,String name) {
		System.out.println("age :"+ age+" "+"name :"+name);
	}
	
	//String,int
	public void add(String name,int age) {
		System.out.println("age :"+ age+" "+"name :"+name);
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverLoading mol=new LearnMethodOverLoading();
		
		mol.add();
		mol.add(7, 9);
		mol.add(25, "dilip");
		mol.add("TestLeaf", 14);
	}
}
