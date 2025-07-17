package flow_control;
import java.util.*;
public class sum_of_digits {
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int sum=0;
			while(num!=0) {
				int a=num%10;
				sum=sum+a;
				num=num/10;
				
        

	}
			System.out.println(""+sum);	

}
}