package Java_Package1;

public class singleDuplicatEelelements {//only single single duplicate element

	public static void main(String[] args) {
		
		int[] a= {10,20,40,20,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}
}
