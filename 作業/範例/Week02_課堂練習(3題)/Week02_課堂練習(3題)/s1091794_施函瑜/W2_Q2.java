//Q2: �̱����ư��D
//410917944 ��ޤGA �I���
//���:2022/3/6
import java.util.*;
public class W2_Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), small=0, large=0;
        for(int i = a-1; i>1; i--) 
        {
            boolean c = false;
            for(int j=2; j<=i; j++)
            {
                if(i==j)
                {
                    small = i;
                    c = true;
                }
                else if(i%j==0)
                {
                    break;
                }
            }
            if (c) 
            {
                break;
            }
        }
        for(int i = a+1; i>a; i++) 
        {
            boolean c = false;
            for(int j=2; j<=i; j++)
            {
                if(i==j)
                {
                    large = i;
                    c = true;
                }
                else if(i%j==0)
                {
                    break;
                }
            }
            if (c) 
            {
                break;
            }
        }
        if((large-a) > (a-small)) 
        {
            System.out.printf("�̱���%d�����:%d",a , small);
        }
        else if((large-a) < (a-small)) 
        {
            System.out.printf("�̱���%d�����:%d",a , large);
        }
        else 
        {
            System.out.printf("�̱���%d�����:%d %d",a , small, large);
        }
    }
}