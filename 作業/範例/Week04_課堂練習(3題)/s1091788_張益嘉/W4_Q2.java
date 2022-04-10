/*班級:資管二B
學號:410917889
姓名:張益嘉
Q2: 前段和與後段和*/
import java.util.*;
public class W4_Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("你要輸入幾個數字");
		int n = sc.nextInt();
		System.out.println("請輸入"+n+"個數字，數字之間以空格隔開");
		int x[] = new int[n];

		for (int i = 0; i < n; i++)
		{
			x[i] = sc.nextInt();
		}
		
		int pre = 0, suf = n - 1, count = 0, sum = 0;

		while (pre < n && suf >= 0) 
		{
			if (sum > 0)
			{
				sum -= x[suf--];
			}
			else if (sum < 0)
			{
				sum += x[pre++];
			}
			else 
			{
				count++;
				sum += x[pre++] -x[suf--];
			}
		}
		System.out.print("有"+count+"組相同的前段和與後段和");
	}
}