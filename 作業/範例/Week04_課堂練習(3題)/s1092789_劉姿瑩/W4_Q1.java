/*
 Q1: �T���X��
 ��ޤGB 410927892 �B����
 date:2022/03/22
*/
import java.util.*;
public class W4_Q1 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J1�Ӥj�󵥩�5������ơG");
		int n=sc.nextInt(),count=0;
		int []arr=new int[n];
		int a=n;
		
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=i+1;
		}
		while(a!=1) {
			for(int i=0;i<arr.length;i++) 
			{
				if(arr[i]!=0) 
				{
					count++;
					if(count==3) 
					{
						arr[i]=0;
						count=0;
						a--;
					}
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
	}
}
