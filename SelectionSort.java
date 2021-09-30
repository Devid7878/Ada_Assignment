package sorting;

public class SelectionSort {


	public static void main(String[] args) {
		
	int a[] = {2,8,4,11,0};
	int n = a.length;
		
	for(int i = 0; i <n-1; i++) {
		int minIndex = i;
		for(int j = i+1; j <n; j++) {
				
			if(a[j] < a[minIndex]) 
				minIndex = j;
				
				int temp = a[minIndex];
				a[minIndex]= a[i];
				a[i]= temp;
			}
			
		}
		
		for(int e:a) {
			System.out.print(e+",");
		}
	}
}
