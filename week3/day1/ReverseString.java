package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
 String ad="amazon";
 //this my output -nozama
 //convert data into tochararray
 //use forloop(reverse loop)
 
 char[] ch = ad.toCharArray();
 
 for (int i = ch.length-1; i >=0 ; i--) {
	System.out.print(ch[i]);
}
 
	}

}
