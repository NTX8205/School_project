//Q1: 排序次序
//班級 資管2A 學號 410917944 姓名 施函瑜
//2022/3/15
import java.util.*;

public class W3_Q1 
{
   public static void main(String[] args) 
		    {
		        Scanner sc = new Scanner(System.in);
		        int m = sc.nextInt();
		        int x [] = new int [m];
		        int cnt [] = new int [m];
		        for(int i = 0; i<m; i++) 
		        {
		            x [i]= (int)(Math.random()*100)+1; 
		            cnt [i]= x [i];
		            System.out.printf("%4d",x[i]);

		        }

		        Arrays.sort(cnt);//10 46 55 60 90 
		        System.out.println();

		        for(int i = 0; i<m; i++)
		        {
		            for(int j=0; j<m; j++) 
		            {
		                if(x[i] == cnt[j])
		                {

		                    System.out.printf("%4d",j+1);
		                    break;
		                }
		            }
		        }
		     }
}
