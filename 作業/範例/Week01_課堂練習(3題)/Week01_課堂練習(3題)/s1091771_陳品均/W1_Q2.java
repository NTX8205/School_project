package hw;
import java.util.Scanner;
public class Q2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.print(a+"=");
			int count=0;
			for(int i=2;i<=a;i++) {
				while(a%i==0) {
					a/=i;
					count++;
				}
				if(a==1) {
					if(count>1)
						System.out.printf("%d*%d",i,count);
					if(count==1)
						System.out.print(i);
				}
				else {
					if(count>1)
						System.out.printf("%d*%d*",i,count);
					if(count==1)
						System.out.printf(i+"*");
					}
					count=0;
				}
				System.out.println();
		}
}
