//W4_Q1三號出局
//
//班級:資管二B
//學號:410917554
//姓名:林冠廷
//
//date:2022/3/16
import java.util.*;
public class W4_Q1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入一個正整數");
        int x=sc.nextInt();
        ArrayList a=new ArrayList<>(x);
        int count=0;
        for(int i=0;i<x;i++)
        {
            a.add(i+1);
        }
        while(a.size()>1)
        {
            for(int i=0;i<a.size();i++)
            {   
                count++;
                if(count%3==0)
                {
                    a.remove(i);
                    count=0;
                    i--;
                }
            } 
        }
        System.out.println("剩下最後的號碼為:"+a.get(0));
    }
}