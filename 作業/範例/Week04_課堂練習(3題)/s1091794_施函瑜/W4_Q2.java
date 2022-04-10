//Q2: 前段和與後段和
//班級:資管2A 學號:410917944 姓名:施函瑜
//日期:2022/3/20
import java.util.*;
public class W4_Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int [] a = new int[x];
		int one=0;
		int	cnt=0;
		for(int i=0; i<x; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<x; i++) 
		{
			one += a[i];
			int xy=0;
			for(int j=x-1; j>=0; j--) 
			{
				xy+=a[j];
				if(one==xy) 
				{
					cnt++;
				}
			}
		}
		System.out.print(cnt);
	}
}
