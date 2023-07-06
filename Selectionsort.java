package Java_Package1;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int[] a= {40,20,15,10};
		selectionsort(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void selectionsort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int minindex=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minindex])
				{
					minindex=j;
				}	
			if(minindex!=i) {
			a[i]=a[i]+a[minindex];
			a[minindex]=a[i]-a[minindex];
			a[i]=a[i]-a[minindex]; 
			    }	
	        }
	    }
    }
}
