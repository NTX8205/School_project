package test;
import java.util.*;
public class W4_Q1 {

	public static void main(String[] args) {
		// Q1:�T���X��
		// ��ǤTB 410855338  ���ӫ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�T���X���C�������a�H��");
		int gg=0/*���`�H��*/,count=0,n = sc.nextInt();
		int[] arr = new int[n];

		while(gg<n-1) 
		{
			for (int i=0;i<n;i++) 
			{
				if (arr[i]!=-1) 
				{
					count++;
					if (count==3) 
					{
						count=0;
						gg++;
						arr[i]=-1;
					}
				}
			}
		}

		for (int i=0;i<n;i++) 
		{
			if (arr[i]!=-1) 
			{
				System.out.println("�̫�d�U�Ӫ��O"+(i+1)+"��");
			}
		}
	}

}
