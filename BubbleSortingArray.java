package Java_Package1;

import java.util.Arrays;

public class BubbleSortingArray {//increasing order bubble sort

	public static void main(String[] args) {
		int[] a={30,40,20,15,10};
	    String initialArray = Arrays.toString(a);
		System.out.println("initialArray: " + initialArray);
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if(a[j-1]>a[j]) {
					a[j-1]=a[j-1]+a[j];
					a[j]=a[j-1]-a[j];
					a[j-1]=a[j-1]-a[j];
				}
			}
		}
		String sortedArray = Arrays.toString(a);
		System.out.println("sortedArray: " + sortedArray);
	}
}








//for(int i=0; i<a.length;i++)
//{
//	for(int j=1;j<a.length;j++)
//	{
//		if(a[j-1]>a[j])
//		{
//			a[j-1]=a[j-1]+a[j];
//			a[j]=a[j-1]-a[j];
//			a[j-1]=a[j-1]-a[j];
//		}
//	}
//}