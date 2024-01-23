package scannerclass;
import java.util.Scanner;
public class Exe1 {
	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("1st no");
		n1 = sc.nextInt();
		System.out.println("2nd no");
		n2 = sc.nextInt();
		System.out.println("3rd no");
		n3 = sc.nextInt();
		int sum = n1+n2+n3;
		System.out.println("sum = " +sum);
		}

}
