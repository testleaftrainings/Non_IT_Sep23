package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {

		//syntax 1-literal
		String companyName="Test Leaf";
		
		String cm="Test leaf";
		
		//syntax 2- object
		
		String comName=new String("Test Leaf");
		
		//m1-length
		
		int length = companyName.length();
		System.out.println("total char :"+length);
	
	//m2-equals-String content
		if(companyName.equals(comName)) {
			System.out.println("string data is equal");
		}else {
			System.out.println("String data is not equal");
		}
	//what is diff b/w .equals() & ==
	//== it will check with memory address	
		if(companyName==comName) {
			System.out.println("string data is equal");
		}else {
			System.out.println("String data is not equal");
		}
		
		//m3-equalsIngoreCase
		
		if(companyName.equalsIgnoreCase(cm)){
			System.out.println("string data is equalsignorecase");
		}else {
			System.out.println("String data is not equalsignorecase");
		}
		
		
		//m4-contains
		String name="Dilip";
		
		boolean contains = name.contains("p");
		System.out.println(contains);
		
		//m5-toCharArray
		String data="Selenium";
		
		char[] ch = data.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		//m6-charAt
		//index value start from '0'
		String var="java";
		char charAt = var.charAt(2);
		System.out.println(charAt);
		
		
		//m7 -tolowercase
		String c="XPath";
		String lc = c.toLowerCase();
		System.out.println(lc);
		//m8-touppercase
		
		String uc = c.toUpperCase();
		System.out.println(uc);
		
		
		
		
		
		
		
		
		
		
		
	}

}
