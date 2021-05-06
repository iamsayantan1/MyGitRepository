package basicJava;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in))	{
			System.out.println("Enter a number to check wheather the number is prime or not: ");
			int n=sc.nextInt();
			boolean isPrime=true;
			if(n==1)
				isPrime=false;
			else if((n&1)==0 || n%3==0 ||n%5==0)
				isPrime=false;
			else{
				for(int i=2;i*i<=n;i++)	{
					if(n%i==0)	{
						isPrime=false;
					}
				}
			}
			if(isPrime)
				System.out.println(n+" is a Prime no.");
			else
				System.out.println(n+" is not a Prime no.");
		}
	}

}
