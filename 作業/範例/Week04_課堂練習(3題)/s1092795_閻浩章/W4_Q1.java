//
//Q1:三號出局
//
//資管二B 410927957 閻浩章
//Date:2022/03/22
import java.util.Scanner;
public class W4_Q1{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		int m=n;
		int out=-1;
		int count=0;
		while(m>1){
			for(int i=0;i<n;i++){
				if(a[i]!=out){
					count++;
					if(count==3){
						a[i]=out;
						m--;
						count=0;
					}
				}
			}
		}
		for(int j=0;j<n;j++){
			if(a[j]!=out){
				System.out.println(j+1);
			}
		}
	}
}
