// Q2: 前段和與後段和
// 410918306 資管二A 李欣玲
// 日期 2022/3/20

package DataStructure;
import java.util.*;
public class W4_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		int[] arr = new int[n];
		System.out.println("請輸入" + n + "個正整數");
		
		for(int i=0;i<n;i++) 
			{
				arr[i] = sc.nextInt();
			}
		
		System.out.print("前段和 ");
		
		for(int i=0;i<n;i++) 
			{
				sum += arr[i];
				System.out.print(sum +" ");
			}
		
		System.out.println();
		System.out.print("後段和 ");
		
		for(int i=n-1;i>=0;i--) 
			{
				sum2 += arr[i];
				System.out.print(sum2 +" ");
			}
	}
}
