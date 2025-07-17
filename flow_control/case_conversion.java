package flow_control;

import java.util.Scanner;

public class case_conversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>='A'&& a<='Z') {
			System.out.println((char)(a+32));
			
		}
		else if(a>='a' && a<='z') {
			System.out.println((char)(a-32));
		}
		
	}
}
