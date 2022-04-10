//W4_Q2: 前段和與後段和
//系級:資管二A  學號:410928042  姓名:王若雯
import java.util.*;
public class W4_Q2 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("計算前段和、後段和\n請輸入一個正整數 n :");
		int n = sc.nextInt();
		int arr [] = new int [n];
		int before_add []= new int [n];
		int after_add []= new int [n];
		int count=0,before_sum=0,after_sum=0;
		
		System.out.printf("再輸入 %d 個正整數:",n);
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.printf("前段和");
		for(int i=0;i<arr.length;i++) 
		{
			before_sum+=arr[i];
			before_add[i]=before_sum;	
			System.out.print(before_add[i]+" ");
		}
		
		int index=0;
		System.out.printf("%n後段和");
		
		for(int i=arr.length;i>0;i--) 
		{
			after_sum+=arr[i-1];
			after_add [index]=after_sum;		
			System.out.print(after_add [index]+" ");
			index++;
		}
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(before_add[i]==after_add [j]) 
				{
					count++;
				}
			}
		}
		System.out.printf("%n在前段和與後段和中，共有%d組相同",count);
	}
}
