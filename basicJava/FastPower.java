package basicJava;
import java.util.Scanner;
public class FastPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))	{
			System.out.println("Enter a number: ");
			int a=sc.nextInt();
			System.out.println("Enter the power: ");
			int b=sc.nextInt();
			System.out.println(a+"^"+b+" = "+Power(a,b));
		}
	}
	static long Power(int a,int b)	{
		long ans=1;
		while(b!=0)	{
			if((b&1)!=0)	{
				ans=ans*a;
			}
			a=a*a;
			b=b>>1;
		}
		return ans;
	}

}
