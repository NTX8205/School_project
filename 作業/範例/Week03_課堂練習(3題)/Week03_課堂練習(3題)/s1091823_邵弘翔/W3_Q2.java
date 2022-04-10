//題目說明:Q2:計算2個正整數的最大公因數&最小公倍數
//班級:資管二B
//學號:410918233
//姓名:邵弘翔
import java.util.*;
public class W3_Q2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int A=n,B=n1;
		System.out.println("陣列A儲存");
		int k=2,m=0,w=0,q=0;
		int [] a=new int [10];
		while(n>=k) {
			if(n%k==0) {	
				a[w]=k;
				w++;
				n=n/k;
				m++;
			}else {
				k++;
			}
		}
		int ar[]=new int [m];
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				ar[q]=a[i];
				q++;
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.printf("%d ",ar[i]);
		}

		System.out.println("\n陣列B儲存");
			int k1=2,m1=0,w1=0,q1=0;
			int [] a1=new int [10];
			while(n1>=k) {
				if(n1%k1==0) {	
					a1[w1]=k1;
					w1++;
					n1=n1/k1;
					m1++;
				}else {
					k1++;
				}
			}
			int ar1[]=new int [m1];
			for(int i=0;i<a1.length;i++) {
				if(a1[i]>0) {
					ar1[q1]=a1[i];
					q1++;
				}
			}
			for(int i=0;i<ar1.length;i++) {
				System.out.printf("%d ",ar1[i]);
			}
			int GCD=1, LCM=1;
			//int i=0,j=0;
			for(int j=0;j<ar1.length;j++) {
				for(int i=0;i<ar.length;i++) {
					if(ar[i]==ar1[j]) {
						GCD=GCD*ar[i];
						LCM=LCM*ar[i];
						ar[i]=1;
						break;
					}
				}
			}
			
			/*
			while(j<=ar1.length) {
				if(ar[i]==ar1[j]) {
					GCD=GCD*ar1[j];
					LCM=LCM*ar1[j];
					i++;j++;
				}else if(i<ar.length){
					LCM=LCM*ar[i];i++;
					continue;
				}else {
					LCM=LCM*ar1[j];j++;
				}
			}
			LCM=LCM*ar1[j];j++;
			*/
			
			System.out.printf("\nGCD=%d	\nLCM=%d",GCD,A*B/GCD);
	}

}
