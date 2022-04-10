// 質因數分解進階版
//資管二B 410918259 陳坤煇

import java.util.Scanner;

public class W2_Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		int x=0;
		System.out.print(n+"=");
		//72 36 18 9 1
		for(int i=2;;) {
			if(n%i==0) {
				x++;
				n=n/i;
			}
			else {
				if(x>1) {
					System.out.print(i+"^"+x);
					
				}
					else if(x==1) {
					System.out.print(i);
				}
				
				
				
				else if(n>0){
					i++;
					continue;
				}
				x=0;
				if(n==1) {
					break;
				}
				else {
					System.out.print("*");
				}
			}
		}

	}

}
