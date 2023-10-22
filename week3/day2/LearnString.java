package week3.day2;

public class LearnString {

	public static void main(String[] args) {

		String data= "Welcome to TestLeaf";
		
		//WelcometoTestLeaf
		//TestLeaf to Welcome
		
		String[] split = data.split("");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
	
			
		}
		System.out.println(" ");
		
		
		for (int i =  split.length-1; i >=0; i--) {
			char[] ch = split[i].toCharArray();
			for (int j = ch.length-1; j >=0 ; j--) {
				System.out.print(ch[j]);
			}
		
		}
		
		System.out.println();
		//replace-char
		
		String companyName= "TestLeaf";
		String replace = companyName.replace('e', '2');
		System.out.println(replace);
		
		//replaceAll
		String var="Amazon have 500 Different Prodcut";
		
		//if i use '^' Except only a-z,A-Z,0-9
		String replaceAll = var.replaceAll("[^a-z,A-Z,0-9]", "@");
		System.out.println(replaceAll);
		
		//subString
		String mentor="vinoth";
		//noth
		//index value start from'0'
		String substring = mentor.substring(2);
		System.out.println(substring);
		
		//no(2,3)
		//startindex and endindex+1
		String substring2 = mentor.substring(2, 4);
		System.out.println(substring2);
		
		
		
		//convert string into int
		String price="2000";
		//Integer.parseInt
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);
		
		
		
		
		
		
		
		
	}

}
