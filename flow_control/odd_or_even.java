package flow_control;

import java.util.Scanner;

public class odd_or_even {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    if(s%2==0) {
    	System.out.println("Even");
    }
    else {
    	System.out.println("odd");
    }
}
}