//Q1: �T���X��
//�Z��:���2A �Ǹ�:410918186 �m�W:�d���
//���:2022/3/20
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