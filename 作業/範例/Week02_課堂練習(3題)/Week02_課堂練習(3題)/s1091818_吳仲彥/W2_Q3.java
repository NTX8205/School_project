//Q3: 質因數分解進階版
//班級 資管2A 學號 410918186 姓名 吳仲彥
//2022/3/6
import java.util.*;
public class W2_Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt(), cnt = 0;
		System.out.printf("%d = ", n);
		for(int i=2;;) 
		{
			if(n%i==0) 
			{
				cnt++;
				n/=i;
			}
			else 
			{
				if(cnt>1)
				{
					System.out.printf("%d^%d", i, cnt);
				}
				else if(cnt==1)
				{
					System.out.printf("%d", i);
				}
				else if(cnt==0)
				{
					i++;
					continue;
				}
				cnt = 0;
				i++;
				if(n==1)
				{
					break;
				}
				else
				{
					System.out.print("*");
				}
			}
		}
	}
}
