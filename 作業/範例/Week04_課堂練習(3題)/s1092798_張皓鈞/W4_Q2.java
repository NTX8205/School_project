//
//Q2: �e�q�M�P��q�M
//�Z��:��ޤGA/�Ǹ�:410927981/�m�W:�i�q�v
//
import java.util.*;
public class W4_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��J�@�ӥ����a:");
		int a = sc.nextInt();
		int x = 0;
		int y = 0;
		int count = 0;
		int[] arr = new int[a];
		int[] arr1 = new int[a];
		int[] arr2 = new int[a];
		
		System.out.println("�A��Ja�Ӿ��:");
		for(int i = 0; i < a; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0; j < a; j++)
		{
			x += arr[j];
			arr1[j] = x; 
		}
		
		for(int k = a-1; k >= 0; k--)
		{
			y += arr[k];
			arr2[k] = y;
		}
		
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j < a; j++)
			{
				if(arr1[i] == arr2[j])
				{
					count++;
				}
			}
		}
		System.out.printf("�� %d �լۦP��",count);
	}
}
