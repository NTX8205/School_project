//W4_Q2: �e�q�M�P��q�M
//�t��:��ޤGA  �Ǹ�:410928042  �m�W:���Y��
import java.util.*;
public class W4_Q2 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("�p��e�q�M�B��q�M\n�п�J�@�ӥ���� n :");
		int n = sc.nextInt();
		int arr [] = new int [n];
		int before_add []= new int [n];
		int after_add []= new int [n];
		int count=0,before_sum=0,after_sum=0;
		
		System.out.printf("�A��J %d �ӥ����:",n);
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.printf("�e�q�M");
		for(int i=0;i<arr.length;i++) 
		{
			before_sum+=arr[i];
			before_add[i]=before_sum;	
			System.out.print(before_add[i]+" ");
		}
		
		int index=0;
		System.out.printf("%n��q�M");
		
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
		System.out.printf("%n�b�e�q�M�P��q�M���A�@��%d�լۦP",count);
	}
}
