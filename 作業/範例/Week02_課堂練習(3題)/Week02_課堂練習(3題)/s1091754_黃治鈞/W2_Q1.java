//[p,q]�϶���ư��D
//��ޤGA 410917546 ���v�v
//Date:2022/3/8
import java.util.*;
public class W2_Q1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int sum=0;
		
		if(p>q) {
			int temp;
			temp =p;
			p=q;
			q=temp;
		}
		for(int i=p;i<q;i++) {
			if(i==1) 
				i++;
			int count=0;
		
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
			System.out.print(i+" ");
			sum++;
			}
		}
		System.out.println("����`�M "+sum);
	}
}
