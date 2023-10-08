package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Arithmetic operators
		System.out.println(2+3);
		System.out.println(2-3);
		System.out.println(2*3);
		System.out.println(2/3);
		System.out.println(2%3);
		//2.Assignment operators:
		int a=10;
		System.out.println(a);
		a+=10;//a=a+10;
		
		a=a*10;
		System.out.println(a);
		
		//3.Comparison operators
		System.out.println(5==5);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>5);
		System.out.println(5>=5);
		System.out.println(5!=5);
		//4.Logical operators:
		
		System.out.println((5<=5) && (5==5));
		System.out.println((5!=5) || (5==5));
		boolean flag=true;
		System.out.println(!flag);
		
		//5. unary operator
		int b=1;
		//System.out.println(b++);
		
		System.out.println(b--);
		System.out.println(b);
		
		
		for (int i = 5; i>=0; i--) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
