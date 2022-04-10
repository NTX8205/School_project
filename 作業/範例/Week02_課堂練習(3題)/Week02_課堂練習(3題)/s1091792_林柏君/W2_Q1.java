/*
班級：資管二B
學號：410917928
姓名：林柏君
題目：區間質數 
*/

import java.util.*;

public class W2_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		int countsum = 0;
		
		if (p>q) {
			int tmp = p;
			p = q;
			q = tmp;
		}
		
		for (int i=p; i<=q; i++) {
			int count = 0;	
			
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					count++;	
				}
			}
				
			if (count==2) {
				System.out.print(i + " ");
				countsum++;
			}
				
		}
		
		System.out.print("\n" + "質數個數：" + countsum);
	}

}
