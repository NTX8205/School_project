// Q1: �T���X��
// 410918306 ��ޤGA ���Y��
// ��� 2022/3/20

package DataStructure;
import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=1;i<=n;i++) 
			{
				arr.add(i);
			}
		
		while(arr.size()!=1) 
			{
				arr.add(arr.remove(0));
				arr.add(arr.remove(0));
				arr.remove(0);
			}
		
		System.out.print(arr.get(0));
	}

}
