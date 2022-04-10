//
//Q2:前段和與後段和
//
//資管二B 410927957 閻浩章
//Date:2022/03/22
import java.util.Scanner;
public class W4_Q2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x = new int [n];
		int[] y = new int [n];
		int[] z = new int [n];
		int a=0;
		int b=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			a+=x[i];
			y[i]=a;
		}
		for(int i=n-1;i>=0;i--){
			b+=x[i];
			z[i]=b;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(y[i]==z[j]){
					sum++;
				}
			}
		}
		System.out.println("共"+sum+"組");
	}
}
