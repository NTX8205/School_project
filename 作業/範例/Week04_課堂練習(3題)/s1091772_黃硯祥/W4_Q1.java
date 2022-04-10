//題目:Q1: 三號出局
//
//班級:資管二B
//姓名:黃硯祥
//學號:410917724
//
//date:2022/3/16

import java.util.*;
public class W4_Q1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("請輸入人數: ");
        int n=sc.nextInt();
        int count=0;
        
        ArrayList  a=new ArrayList();
        
        for(int i=1 ;i<=n ;i++)
        {
            a.add(i);
        }

        while(a.size()>1)
        {
            for(int i=0 ;i<a.size() ;i++)
            {
                count++;
                if(count==3)
                {
                    a.remove(i);
                    count=0;
                    i--;
                }
            }
        }
        
        System.out.println("最後一人為: "+a.get(0));
    }
}            