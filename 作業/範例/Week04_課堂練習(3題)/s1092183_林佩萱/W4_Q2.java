//Q2: �e�q�M�P��q�M
//��ޤGB 410921838 �L�ظ�
import java.util.*;
public class W4_Q2 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int cal = arr[0];
		list.add(cal);
		for(int i=1;i<n;i++)
		{
			cal+=arr[i];
			list.add(cal);
		}
		cal = arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(list.contains(cal))
				count++;
			cal+=arr[i];
		}
		if(list.contains(cal))
			  count++;
		System.out.print(count);
	}
}

