//Q1: [p,q]�϶���ư��D
//410917944 ��ޤGA �I���
//���:2022/3/7

import java.util.*;
public class W2_Q1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), sum = 0;
        for(int i = Math.min(a, b); i<=Math.max(b, a); i++) 
        {
            for(int j=2; j<=i; j++)
            {
                if(i==j)
                {
                    System.out.print(i + " ");
                    sum++;
                }
                else if(i%j==0)
                {
                    break;
                }
            }
        }
        System.out.printf("%n��ƭӼ�:%d",sum);
    }
}