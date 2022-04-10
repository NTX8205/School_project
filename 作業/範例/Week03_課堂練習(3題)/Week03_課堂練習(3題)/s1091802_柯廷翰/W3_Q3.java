package a;
import java.util.*;
public class W3_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("請輸入一個正整數:");
		
		int x = sc.nextInt();
		
		System.out.print("再輸入一個正整數:");
		
		int y = sc.nextInt();
		
		System.out.print("再輸入一個正整數:");
		
		int z = sc.nextInt();
		int w = 2;
		int[] arra = new int[10];
		int[] arrb = new int[10];
		int[] arrc = new int[10];
		
		int a = 0;
		while(x != z) 
		{
			if(x % z == 0)
			{
				arra[a] = z;
				x = x / z;
				a++;
			} 
			else 
			{
				w++;
			}
		}
		arra[a] = x;
		w = 2;
		
		int b = 0;
		while(x != z) 
		{
			if(x % z == 0)
			{
				arrb[b] = z;
				x = x / z;
				b++;
			} 
			else 
			{
				w++;
			}
		}
		arrb[b] = x;
		w = 2;
		
		int c = 0;
		while(x != z) 
		{
			if(x % z == 0)
			{
				arrc[c] = z;
				x = x / z;
				c++;
			} 
			else 
			{
				w++;
			}
		}
		arrc[c] = x;
	}
}
