/*�e�q�M�P��q�M
��ޤGB 410917538 ��Ϊ�
2022/03/21
*/
import java.util.*;
public class W4_Q2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����!!�õ����ƶq����");
		
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
