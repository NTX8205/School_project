import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{//��ޤGA 410917855 ���f��
	// �T���X��
		Scanner io=new Scanner (System.in);
		System.out.println("�о�J�����ժ���(����0�������):");
		int a=io.nextInt();
		int arr[]=new int [a+1];
		int i=1,sum=0,count=1;
		while(true) 
		{
			if(i==arr.length) 
				{
					i=1;
				}
			if(count%3==0) 
			{
				if(arr[i]==-1) 
					{
						i++;
						continue;
					}
				arr[i]=-1;
				sum+=arr[i];
				count=1;
			}
			else 
			{
				if(arr[i]==-1) 
				{
					i++;
					continue;
				}
				i++;
				count++;
				continue;
			}
			if(sum==-1*(a-1)) 
			{
				break;
			}
				i++;
		}
		for(int l=1;l<arr.length;l++)
		{
			if(arr[l]==0) 
			{
				System.out.println("�̫�ѤU��:"+l);
			}
		}
	}

}