// Q2: 前段和與後段和
// 410917716 資管二A 陳品均
// 日期 2022/3/14
package hw;
import java.util.*;
public class W4_Q2 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		int b=0,count=0;
		for(int i=0;i<n;i++) {
			b+=a[i];
			int p=0;
			for(int j=n-1;j>=0;j--) {
				p+=a[j];
				if(b==p)
					count++;
			}
		}
		System.out.print(count);
	}
}
