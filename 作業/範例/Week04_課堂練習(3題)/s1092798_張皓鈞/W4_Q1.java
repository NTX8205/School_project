//
//QQ1: �T���X��
//�Z��:��ޤGA/�Ǹ�:410927981/�m�W:�i�q�v
//
import java.util.*;
public class W4_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����:");
		
		int a = sc.nextInt();
		int tis = a;
		int count = 0;
		int[] arr = new int[a];
		
		while(tis > 1)
		{
			for(int i = 0; i < a; i++)
			{
				if(arr[i] == 0)
				{
					count++;	
					if(count == 3)
					{
						arr[i]++;
						tis--;
						count = 0;
					}
				}
			}
		}
	
		for(int i = 0; i < a; i++)
		{
			if(arr[i] == 0)
			{
				System.out.println("�̫�@�ӥ��X���̪��s��"+(i+1));
			}
		}
	}
}


