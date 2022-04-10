//Q3: 質因數分解進階版
//410917944 資管二A 施函瑜
//日期:2022/3/6
import java.util.;
public class W2_Q3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a  =sc.nextInt(), sum = 0;
        System.out.printf("%d = ", a);
        for(int i=2;;) 
        {
            if(a%i==0) 
            {
                sum++;
                a/=i;
            }
            else 
            {
                if(sum>1)
                {
                    System.out.printf("%d^%d", i, sum);
                }
                else if(sum==1)
                {
                    System.out.printf("%d", i);
                }
                else if(sum==0)
                {
                    i++;
                    continue;
                }
                sum = 0;
                i++;
                if(a==1)
                {
                    break;
                }
                else
                {
                    System.out.print("");
                }
            }
        }
    }
}
