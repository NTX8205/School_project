//Q1: [p,q]區間質數問題
//班級 資管2A 學號 410918186 姓名 吳仲彥
//2022/3/6
import java.util.*;
public class W2_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), cnt = 0;
		for(int i = Math.min(x, y); i<=Math.max(y, x); i++) 
		{
			for(int j=2; j<=i; j++)
			{
				if(i==j)
				{
					System.out.print(i + " ");
					cnt++;
				}
				else if(i%j==0)
				{
					break;
				}
			}
		}
		System.out.printf("%n質數個數:%d",cnt);
	}
}
