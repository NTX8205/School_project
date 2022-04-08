// Q2：質因數分解
// 班級:資管二B
// 學號:41098050
// 姓名:許哲睿

import java.util.*;

public class Q2 
{
    public static void main(String[] args) 
    {
        System.out.println("質因數分解");
        Scanner sc =new Scanner(System.in);
        System.out.print("輸入一正整數 : ");
        int n = sc.nextInt();

        sc.close();

        int temp=n;
        System.out.print(n+"=");
        for(int i=2;temp!=1;i++)
        {   
            int count = 0;
            while(temp%i==0)
            {
                count++;
                temp/=i;
            }
            if(count>0)
            {
                if(count==1)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i+"^"+count);
                }
                
                
                if(temp!=1)
                {
                    System.out.print("*");
                }
            }
        }
    }
}
