/*前段和與後段和
資管二B 410917538 何佳芯
2022/03/21
*/
import java.util.*;
public class W4_Q2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個正整數!!並給此數量的值");
		
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{ 
			a[i]=sc.nextInt();
		}
		
		int front = 0,count = 0;
		for(int i=0;i<n;i++) 
		{
			front+=a[i];
			int behind=0;
			for(int j=n-1;j>=0;j--) 
			{
				behind+=a[j];
				if(front == behind) 
					count++;
				
			}
		}
		System.out.print(count);
	}

}
