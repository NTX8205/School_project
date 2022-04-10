//
//Q1: 排序次序
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W3_Q1 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個正整數:");
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		int x = 0;
		int y = 0;
		
		for(int i=0;i<a;i++)
		{
			arr[i] = (int)(Math.random()*100);

			if(i == (a-1)) 
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		for(int i=0;i<a;i++) 
		{
			x = 0;
			y = 0;
			
			for(int j=0;j<a;j++)
			{
				if(arr[i] > arr[j])
				{
					x++;
				}
				if(arr[i] == arr[j])
				{
					x++;
					y++;
				}
			}
			
			if(y == 0)
			{
				System.out.print(x+" ");
			}
			else
			{
				System.out.print((x-y+1)+" ");
			}
		}
	}
}
