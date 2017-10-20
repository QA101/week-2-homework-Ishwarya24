
public class reverseanarray {
	public static void main(String[] args)
	{
		int i,j;
		int[] a= {1,2,3,4};
		for(i=0;i<4;i++)
		for(j=3;j<=i;j--)			
		{
			a[i]=a[j];	
			System.out.println("a"+"["+i+"]"+"="+a[i]);
		}
		
	}

}
