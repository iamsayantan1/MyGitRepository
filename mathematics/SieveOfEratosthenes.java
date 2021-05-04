package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))	{
			System.out.print("Enter upto how many number you want to find Prime numbers: ");
			int n=sc.nextInt();
			boolean[] b = isPrime(n);
			for(int i=0;i<=n;i++)	{
				if(b[i])
					System.out.print(i+" ");
			}
		}
		
	}
	
	static boolean[] isPrime(int n)	{
		boolean[] a=new boolean[n+1];
		Arrays.fill(a, true);
		a[0]=false;
		a[1]=false;
		for(int i=2;i*i<=n;i++)	{
			for(int j=2*i;j<=n;j=j+i)	{
				a[j]=false;
			}
		}
		return a;
	}

}
