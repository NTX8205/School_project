//題目:Q2: 前段和與後段和
//
//班級:資管二B
//姓名:黃硯祥
//學號:410917724
//
//date:2022/3/16

import java.util.*;
public class W4_Q2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("請輸入數字: ");
        int n=sc.nextInt();
        int sum=0;
        int sum1=0;
        int count=0;

        ArrayList a =new ArrayList();
        ArrayList b =new ArrayList();
        ArrayList c =new ArrayList();

        for(int i=1 ;i<=n ;i++)
        {
            a.add(i);
        }

        for(int i=0; i<a.size() ;i++)
        {
            sum=sum+(int)a.get(i);
            b.add(sum);
        }
        for(int i=n-1; i>-1 ;i--)
        {
            sum1=sum1+(int)a.get(i);
            c.add(sum1);
        }

        for(int i=0 ;i<b.size() ;i++)
        {
            int j=0;
            while(j<c.size())
            {
                if((int)b.get(i) == (int)c.get(j))
                {
                    count++;
                }
                j++;
            }       
        }
        System.out.printf("%d組",count);
    }
}            