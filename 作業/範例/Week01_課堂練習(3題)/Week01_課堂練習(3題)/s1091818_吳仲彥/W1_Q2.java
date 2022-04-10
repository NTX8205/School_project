//Q2: 將使用者輸入的正整進行質因數分解
//班級:資管2A 學號:410918186 姓名:吳仲彥
//日期:2022/2/23
import java.util.*;
public class W1_Q2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n + "=");
		for(int i=2; i<=n; i++)
		{
			while(n!=i)
			{
				if(n%i==0)
				{
					System.out.print(i + "*");
					n /= i;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(n);
	}
}