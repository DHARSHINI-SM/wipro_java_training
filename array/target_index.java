package array;
import java.util.Scanner;
public class target_index {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        
	        int[] arr = new int[n];
	        
	        
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        
	        System.out.print("Enter the target element to find: ");
	        int target = sc.nextInt();
	        
	        
	        int index = -1; 
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == target) {
	                index = i; 
	                break; 
	            }
	        }
	        
	        
	        System.out.println("Index of target element: " + index);
	        
	        sc.close();
	    }
	}


