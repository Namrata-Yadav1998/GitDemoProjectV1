package Basic;

public class fibonacci {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1,i,k,count=10;
		System.out.println(n1);
		System.out.println(n2);
		
		for(i=2;i<count;++i)
		{
			k=n1+n2;
			System.out.println(k);
			n1=n2;
			n2=k;
			
		}
	}
}
