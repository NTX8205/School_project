//Q1: �T���X��
//��ޤGB/410918178/���䧱

import java.util.*;

public class W4_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J�@�Ӥj�󵥩�5�������:");
		int n = sc.nextInt();
		int[] people = new int[n];
		int count = 0;
		int remain = n;
		
		if(n >= 5) 
		{
			while(remain > 1) 
			{
				for(int i = 0 ; i < n ; i++) 
				{
					if(people[i] != -1) 
					{
						count++;
						if(count == 3) 
						{
							count = 0;
							remain--;
							people[i] = -1;
						}
					}
				}
			}
			
			for(int i = 0 ; i < n ; i++) 
			{
				if(people[i] != -1)
					System.out.print(i+1);
			}
		}
		
	}
}
