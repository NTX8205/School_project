package a;
import java.util.*;
public class W3_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("請輸入一個正整數:");
		
		int x = sc.nextInt();
		
		System.out.print("再輸入一個正整數:");
		
		int y = sc.nextInt();
		int z = 2;
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		
		int a = 0;
		while(x != z) 
		{
			if(x % z == 0)
			{
				arr[a] = z;
				x = x / z;
				a++;
			} 
			else 
			{
				z++;
			}
		}
		arr[a] = x;
		z = 2;
		
		int b = 0;
		while(y != z) 
		{
			if(y % z == 0) 
			{
				arr1[b] = z;
				y = y / z;
				b++;
			} 
			else 
			{
				z++;
			}
		}
		arr1[b] = y;
	}
}
