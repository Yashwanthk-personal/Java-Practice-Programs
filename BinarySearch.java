package Java_Package1;

import java.util.Arrays;

public class BinarySearch { //sorting as to be done to do binary search.

	public static void main(String[] args) {
		
		int[] a= {10,30,40,20,50,60};
		
		ascendingSort(a);//Need to sort the array in Ascending order inorder to do BinarySeach
		
		System.out.println("sortedArray: " + Arrays.toString(a));//to print in arrays format
		
		bnrysrch(a, 50);
	}
	
	public static void bnrysrch(int[] a,int key)
	{
		int first=0;
		int last=a.length-1;
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(key<a[mid]) {
				last = mid-1;
			}
			else if(key==a[mid]) {
				System.out.println(key + " is found at the position " + mid);
				break;
			}
			else if (key>a[mid]){
				first = mid+1;
			}
			mid = (first+last)/2;
			
		}
		
		if(first>last)
			System.out.println(key+ " is not found");
		
	}
	
	public static void ascendingSort(int[] b) {
	    String initialArray = Arrays.toString(b);
		System.out.println("initialArray: " + initialArray);
		for (int i = 0; i < b.length; i++) {
			for (int j = 1; j < b.length; j++) {
				if(b[j-1]>b[j]) {
					b[j-1]=b[j-1]+b[j];
					b[j]=b[j-1]-b[j];
					b[j-1]=b[j-1]-b[j];
				}
			}
		}
	}
}

//count++;
//System.out.println("Count is = " + count);
//System.out.println("Vlaue = "+mid);
//if(key<a[mid])
//  last=mid-1;
//else if(key==a[mid]) {
//	System.out.println(key+" is found at index = "+mid);
//	break;
//}
//else if(key>a[mid]) {
//		first=mid+1;
//}
//mid=(first+last)/2;
