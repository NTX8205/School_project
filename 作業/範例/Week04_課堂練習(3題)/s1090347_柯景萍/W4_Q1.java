//�D�ػ���:�T���X��
//��ޤGA 410903474 �_����
//Date:2022/03/21

package test;
import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
		System.out.println("�п�J�@�ӤH�� n�A n >= 5");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] aa = new int [n];
        int all = n;
        int count = 0;
        
        while(all>1) 
        {
            for(int i=0;i<n;i++) 
            {
                if(aa[i]!= -1) 
                {
                    count++;
                    if(count == 3) 
                    {
                        count = 0;
                        all--;
                        aa[i] = -1;
                    }
                }
            }
        }
        
        for(int i=0;i<aa.length;i++) 
        {
            if(aa[i]!= -1) 
            {
                System.out.println(i+1);

            }
        }
    }
}