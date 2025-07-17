package flow_control;

import java.util.Scanner;

public class percentage_interest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str=sc.next();
		if(str=="Female" && a>=1 && a<=58) {
			System.out.println("8.2%");
		}
		else if(str=="Female" && a>=59 && a<=100) {
			System.out.println("9.2%");
		}
		else if(str=="Male" && a>=1 && a<=58) {
			System.out.println("8.4%");
		}
		else if(str=="Male" && a>=59 && a<=100) {
			System.out.println("10.5%");
		}
	}

}
