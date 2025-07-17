package array;
import java.util.Scanner;
public class mid_elements {
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        
	        System.out.print("Enter size of first array (odd size): ");
	        int n1 = sc.nextInt();
	        int[] arr1 = new int[n1];
	        
	        System.out.println("Enter " + n1 + " elements for first array:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }
	        
	       
	        System.out.print("Enter size of second array (odd size): ");
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];
	        
	        System.out.println("Enter " + n2 + " elements for second array:");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }
	        
	        
	        int[] newArr = new int[2];
	        newArr[0] = arr1[n1 / 2];
	        newArr[1] = arr2[n2 / 2];
	        
	       
	        System.out.println("New array with middle elements:");
	        for (int i = 0; i < newArr.length; i++) {
	            System.out.print(newArr[i] + " ");
	        }
	        
	        sc.close();
	    }
	}


