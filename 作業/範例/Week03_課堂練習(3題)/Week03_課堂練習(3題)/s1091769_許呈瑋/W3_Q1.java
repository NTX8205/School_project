//排序次序
//資管二B 410917693 許呈瑋
//111/03/11
import java.util.*;
public class W3_Q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i = 0;i <n; i++)
		{
			a[i] = (int)(Math.random()*100)+1;
			System.out.print(a[i]+" ");
			b[i] = a[i];
		}
		System.out.println();
		Arrays.sort(b);
		for(int i = 0;i <n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(b[i] == a[j])
				{
					a[j] = i+1;
					break;
				}
			}
		}
		for(int i = 0; i < n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
