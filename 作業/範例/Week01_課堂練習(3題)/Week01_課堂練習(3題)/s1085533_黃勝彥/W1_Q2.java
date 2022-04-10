package test;
import java.io.*;
import java.util.Scanner;
public class W1_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ¸ê¶Ç¤TB 410855338  ¶À³Ó«Û
		
		Scanner sc = new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		System.out.print(n+" = ");
		
		for(i=2;i<=n;i++) {
			while(i!=n) {
				if(n%i == 0) {
					System.out.print(i+ "*");
					n=n/i;
				}
				else {
					break;
				}
			}
		}
		System.out.println(n);
	}

}
