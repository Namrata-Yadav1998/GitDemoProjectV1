package GitPractice;

import java.util.Scanner;

public class CountVowAndConsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word :");
		String str=sc.nextLine();
		String newstr=str.toLowerCase();
		int vol_count=0;
		int cons_count=0;
		
		for(char ch:str.toCharArray())
		{
			if("aeiou".indexOf(ch)!=-1)
			{
				vol_count++;
				
				
			}
			else {
				cons_count++;
			}
	
		
				
			}		
		System.out.println("Number of vowel :"+vol_count);
			System.out.println("Number of consonant :"+cons_count);
	
		}
}
