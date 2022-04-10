//W4_Q2前段和與後段和
//
//班級:資管二B
//學號:410917554
//姓名:林冠廷
//
//date:2022/3/18
import java.util.*;
public class W4_Q2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入一個正整數 N 以及N個整數");
        int x=sc.nextInt();
        int[] a=new int[x];
        int[] b=new int[x];
        int[] c=new int[x];
        int c1=x-1;
        int count=0;
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
            b[0]=a[0];
            if(i!=0)
            {
                b[i]=a[i]+b[i-1];
            }
        }
        for(int i=0;i<x;i++)
        {
            if(i!=0)
            {
            c[i]=a[c1]+c[i-1];
            }else{
                c[i]=a[c1];
            }
            c1--;
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(c[i]==b[j])
                {
                    count=count+1;
                    break;
                }
            }
        }  
        System.out.printf("共%d組",count);
    }   
}
