//Q3:計算3個正整數的最大公因數&最小公倍數
//班級 資管2A 學號 410917944 姓名 施函瑜
//2022/3/15
import java.util.;
public class W3_Q3 
{
    public static void main(String[] args) {
	    {
	        Scanner sc = new Scanner (System.in);
	        int a = sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
	        int q=2; int GCD=1; int LCM=1;
	        int X=a; int Y=b; int Z=c;
	        while(X>=q && Y>=q && Z>=q) 
	        {
	            if(X%q==0 && Y%q==0 && Z%q==0) 
	            {
	                GCD*=q;
	                LCM*=q;
	                X/=q;
	                Y/=q;
	                Z/=q;
	            }
	            else if(X%q==0 && Y%q==0)
	            {
	                LCM*=q;
	                X/=q;
	                Y/=q;
	            }
	            else if(X%q==0 && Z%q==0)
	            {
	                LCM*=q;
	                X/=q;
	                Z/=q;
	            }
	            else if(Z%q==0 && Y%q==0)
	            {
	                LCM*=q;
	                Z/=q;
	                Y/=q;
	            }
	            else
	            {
	                q++;
	            }
	        }
	        LCM=LCM*X*Y*Z;
	        System.out.printf("%d與%d與%d的最大公因數為%d%n",a , b, c, GCD);
	        System.out.printf("%d與%d與%d的最小公倍數為%d",a , b, c, LCM);
	    }
	}

}
