//Q1: 判斷使用者輸入的正整數是否為質數
//班級:資管2A 學號:410918186 姓名:吳仲彥
//日期:2022/2/23
import java.util.*;
public class W1_Q1
{
	public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt<=2)
		{
			System.out.println(n + "是質數");
		}
		else
		{
			System.out.println(n + "不是質數");
		}
	}
}