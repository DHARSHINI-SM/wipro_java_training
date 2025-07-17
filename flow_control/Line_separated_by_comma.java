package flow_control;
import java.util.*;
public class Line_separated_by_comma {
	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	String  s1 = Sc.nextLine();
	String  s2 = Sc.nextLine();
	if(s1.isEmpty() && s2.isEmpty()) {
		System.out.print("No values");
	}
	else {
		System.out.print(s1+","+s2);
	}
	
}
}


