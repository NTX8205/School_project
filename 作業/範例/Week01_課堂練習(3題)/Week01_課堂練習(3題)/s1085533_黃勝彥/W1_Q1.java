package test;
import java.io.*;
import java.util.Scanner;
public class W1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 資傳三B 410855338  黃勝彥
		
		Scanner sc = new Scanner(System.in);
		int n,i,factorNum=0;
		n=sc.nextInt();
		System.out.print(n);

		for(i=1;i<=n;i++) {
			if(n%i==0) {
				factorNum++;
			}
		}

		if(factorNum==2) {
			System.out.print("是質數");		
		}
		else {
			System.out.print("不是質數");
		}
	}

}
