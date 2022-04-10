//題目說明:質因數分解進階版
//資管二A 410903474 柯景萍
//Date:2022/03/06

import java.util.Scanner;
public class W2_Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum=0;
		System.out.print(n+ "=" );
		
		for(int i=2;;) {			
			if(n%i == 0) {
				sum++;
				n /= i;
			}else {
				if(sum>1) {
					System.out.print(i+"^"+sum);
				}else if(sum ==1){
					System.out.print(i);
				}else if(sum==0){
					i++;
					continue;
				}
				sum=0;
				i++;
				if(n==1) {
					break;
				}else {
					System.out.print("*");
				}
			}
		}
	}
}