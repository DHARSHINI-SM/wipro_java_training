
package flow_control;

import java.util.Scanner;

public class samelastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a%10==b%10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

}
