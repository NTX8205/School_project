//�D�ػ���:�p��3�ӥ���ƪ��̤j���]��&�̤p������
//��ޤGA 410903474 �_����
//Date:2022/03/15
package test;
import java.util.*;
public class W3_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k=2;
		
		int a[] = new int[];
		
		while(x>k) 
		{
			if(x%k==0) 
			{
				x=x/k;
								
			}
			else 
			{
				k++;
			}
			System.out.println(x);
		}
	}
}