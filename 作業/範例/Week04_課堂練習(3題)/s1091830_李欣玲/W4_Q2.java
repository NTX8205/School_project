// Q2: �e�q�M�P��q�M
// 410918306 ��ޤGA ���Y��
// ��� 2022/3/20

package DataStructure;
import java.util.*;
public class W4_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		int[] arr = new int[n];
		System.out.println("�п�J" + n + "�ӥ����");
		
		for(int i=0;i<n;i++) 
			{
				arr[i] = sc.nextInt();
			}
		
		System.out.print("�e�q�M ");
		
		for(int i=0;i<n;i++) 
			{
				sum += arr[i];
				System.out.print(sum +" ");
			}
		
		System.out.println();
		System.out.print("��q�M ");
		
		for(int i=n-1;i>=0;i--) 
			{
				sum2 += arr[i];
				System.out.print(sum2 +" ");
			}
	}
}
