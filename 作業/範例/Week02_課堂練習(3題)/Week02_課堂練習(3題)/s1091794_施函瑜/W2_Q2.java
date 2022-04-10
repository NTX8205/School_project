//Q2: 最接近質數問題
//410917944 資管二A 施函瑜
//日期:2022/3/6
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
            System.out.printf("最接近%d的質數:%d",a , small);
        }
        else if((large-a) < (a-small)) 
        {
            System.out.printf("最接近%d的質數:%d",a , large);
        }
        else 
        {
            System.out.printf("最接近%d的質數:%d %d",a , small, large);
        }
    }
}