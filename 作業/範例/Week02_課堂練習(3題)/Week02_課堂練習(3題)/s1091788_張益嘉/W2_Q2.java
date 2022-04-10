/*
�t��:��ޤGB
�Ǹ�:410917889
�m�W:�i�q��
�D��:Q2: �̱����ư��D
 */
package main;
import java.util.*;
public class W2_Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),small=0,large=0;
		for(int i=n-1;i>1;i--) {
			if(isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		for(int i=n+1;;i++) {
			if(isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		if((large-n)>(n-small)) {
			System.out.print("�̱���"+n+"�����"+small);
		}else if((large-n)<(n-small)) {
			System.out.print("�̱���"+n+"�����"+large);
		}else {
			System.out.print("�̱���"+n+"�����"+small+" "+large);
		}
	}
	public static boolean isPrimeNumber(int n) {
		if(n%2==0) {
			return n==2;
		}else if(n>2) {
			final int nSqrt =(int)Math.floor(Math.sqrt(n));
			for(int i=3;i<=nSqrt;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}		
	}
}
