package GitPractice;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String Name=sc.nextLine();
		String str="Namrata";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
			
		}System.out.println("Reverse of the String is : "+rev);

	}

}
