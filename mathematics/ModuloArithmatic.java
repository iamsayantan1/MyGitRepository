package mathematics;

import java.util.Scanner;

public class ModuloArithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))	{
			System.out.println("Enter a number: ");
			int a=sc.nextInt();
			System.out.println("Enter the power: ");
			int b=sc.nextInt();
			System.out.println("Enter the modulo: ");
			int c=sc.nextInt();
			System.out.println("Remainder: "+a+"^"+b+"%"+c+" = "+ModuloArithmatic(a,b,c));
		}
	}
	static long ModuloArithmatic(int a,int b,int n)	{
		long ans=1;
		while(b!=0)	{
			if((b&1)!=0)	{
				ans=(ans*(a%n))%n;
			}
			a=((a%n)*(a%n))%n;
			b=b>>1;
		}
		return ans;
	}
}
