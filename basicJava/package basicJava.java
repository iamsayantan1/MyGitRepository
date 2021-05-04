package basicJava;
import java.util.Scanner;
public class FactorialOfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in))	{
			System.out.println("Enter a number which you want to be factorialed: ");
			int n=sc.nextInt();
			long f=1;
			for(int i=n;i>0;i--)	{
				f*=i;
			}
			System.out.println("Factorial of "+n+" is "+f);
		}
	}

}