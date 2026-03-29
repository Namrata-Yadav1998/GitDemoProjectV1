package GitPractice;

import java.util.Arrays;

public class LargestNumberArray {

	public static void main(String[] args) {
		int[] arr= {11,13,9,16,19,6};
//		Arrays.sort(arr);
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		System.out.println("Largest Number in Array is :"+max);
		
	}

}
