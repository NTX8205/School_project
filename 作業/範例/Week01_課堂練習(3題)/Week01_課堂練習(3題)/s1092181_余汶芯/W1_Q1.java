import java.util.Scanner;
public class Q1 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		if(count==2) {
			System.out.println(n+"�O���");
		}else {
			System.out.println(n+"���O���");
		}
	}
}
