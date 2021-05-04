package mathematics;
import java.util.Scanner;
public class EuclideanGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))	{
		System.out.print("Enter two numbers to get GCD of thease numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("GCD of "+a+" and "+b+" is "+ GCD(a,b));
		}
	}
	
	static int GCD(int a,int b)	{
		if(b==0)	
			return a;	
		else	{
			return GCD(b,a%b);
		}
	
	}

}
