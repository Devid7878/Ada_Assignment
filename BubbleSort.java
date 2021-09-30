package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {1,4,11,7,5,2,41};
		for (int i=0; i<a.length-1; i++) {
			for (int j=i; j<a.length-1; j++) {
				
				if(a[i]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[i];
					a[i] = temp;
					
				}
			}
			
		}
		for(int element: a) {
			System.out.print(element + ",");
		}
	}

}
