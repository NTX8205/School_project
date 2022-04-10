//題目說明:計算3個正整數的最大公因數&最小公倍數
//資管二A 410903474 柯景萍
//Date:2022/03/15
package test;
import java.util.*;
public class W3_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k=2;
		
		int a[] = new int[];
		
		while(x>k) 
		{
			if(x%k==0) 
			{
				x=x/k;
								
			}
			else 
			{
				k++;
			}
			System.out.println(x);
		}
	}
}