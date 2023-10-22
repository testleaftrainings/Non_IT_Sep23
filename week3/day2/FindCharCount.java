package week3.day2;

public class FindCharCount {

	public static void main(String[] args) {

		String name="TestLeaf";
		//e=2
		char targetChar='t';
		int count=0;
		
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)==targetChar) {
				//e==e
				count++;//count=count+1
			}
		}
		System.out.println(targetChar+": its present :"+ count);
	}

	
}
