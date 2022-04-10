//前段和與後段和
//410654114資工5B李明熹
//2022/3/21
import java.util.Scanner;

public class W4_Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int a[]=new int[input];
		
		for(int i=0;i<input;i++) {
			a[i]=sc.nextInt();
		}
		
		int pre=0;
		int count=0;
		
		for(int i=0;i<input;i++) {
			pre+=a[i];
			int post=0;
			for(int j=input-1;j>=0;j--) {
				post+=a[j];
				if(pre==post) {
					count++;
				}
			}
		}
		System.out.print(count);

	}

}
