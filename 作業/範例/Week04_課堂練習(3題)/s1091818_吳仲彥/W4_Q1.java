//Q1: 三號出局
//班級:資管2A 學號:410918186 姓名:吳仲彥
//日期:2022/3/20
import java.util.Scanner;
public class W4_Q1
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int remain = n ; 
        int cnt = 0 ; 
        int out = -1 ;
        while (remain > 1)
        {
            for (int i = 0; i < n; i++) 
            {
                if (a[i] != out)
                {
                    cnt++;
                    if (cnt == 3) 
                    {
                        cnt = 0;
                        remain--;
                        a[i] = out;
                        
                    }
                }
            }
        }
            for(int i=0;i<n;i++)
            {
                if (a[i]!=out)
                {
                    System.out.println((i+1));
                }
            }
	}
}