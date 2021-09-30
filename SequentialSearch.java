package searching;

import java.util.Scanner;

public class SequentialSearch {

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int[] arr = {12, 23, 10, 34, 55, 4, 68, 3, 73, 99};
		    
		    System.out.println("Enter value to search: ");
		    
		    int searchElement = sc.nextInt();
		    int index = sequentialSearch(arr, searchElement);
		    
		    if(index != -1){
		        System.out.println("Searched item " + arr[index] + " found at index "+index);
		    }else{
		        System.out.println("Searched item " + searchElement + " not found in the array");
		    }
		  }
		    
		  private static int sequentialSearch(int[] arr, int searchElement){
		    for(int i = 0; i < arr.length; i++){
		      
		    	if(arr[i] == searchElement){
		        return i;
		      }
		    }
		    return -1;
		  }
}