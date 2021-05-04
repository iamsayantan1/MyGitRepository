package recursion;
import java.util.Scanner;
public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of people: ");
		int n=sc.nextInt();
		System.out.print("Enter the number of people to skip: ");
		int k=sc.nextInt();
		System.out.println("People in the "+jos(n,k)+" position only can live.");
		sc.close();
	}
	static int jos(int n, int k) {
		if(n==1)
			return 0;
		else
			return (jos(n-1,k)+k)%n;
	}

}
