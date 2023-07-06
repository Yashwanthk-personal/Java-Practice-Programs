package Java_Package1;

public class linearsearch {//if duplicate values are present inside the array then this logic won't work.

	public static void main(String[] args) {
		
		int[] a= {10,12,30,50,60};
		int position = lnrsearch(a, 50);
		System.out.println("Element is found at the position  "+ position);
	
	}
	
	public static int lnrsearch(int[] a,int key) {
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
