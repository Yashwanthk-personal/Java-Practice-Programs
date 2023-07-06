package Java_Package1;

public class multipleDuplicatEelements {//this will work for multiple duplicate elements

public static void main(String[] args) {
		
		int[] a = {10,20,40,10,20,10,10,20,30,10};
		int[] duplicate = new int[a.length]; //because we are assigning -1 values whenever we got duplicate elements
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					duplicate[j]=-1;
				}
			}
		}
		
		for(int i=0;i<=duplicate.length-1;i++) {
			if(duplicate[i]==-1) {
				System.out.println(a[i]+" is @ "+i);
			}
		}
		
	}
}
