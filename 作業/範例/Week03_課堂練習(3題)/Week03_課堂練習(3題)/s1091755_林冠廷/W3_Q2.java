//W3_Q2最大公因數&&最小公倍數
//
//班級:資管二B
//學號:410917554
//姓名:林冠廷
//
//date:2022/3/9
import java.util.*;
import java.lang.*;
public class W3_Q2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        AL al=new AL();
        ArrayList A=AL.arr1(a);
        ArrayList B=AL.brr1(b);
        int d=1;
        for (int i=0;i<A.size();i++)
        {
            for(int j=0;j<B.size();j++)
            {
                if(A.get(i)==B.get(j))
                {
                    String c=B.get(j).toString();
                    int x= Integer.parseInt(c);
                    d*=x;
                    B.remove(j);
                }
            }
        }
        System.out.println("最大公因數:"+d);
        int dd=1;
        for(int j=0;j<B.size();j++)
        {
            String c=B.get(j).toString();
            int x=Integer.parseInt(c);
            dd*=x;
                
        }
        System.out.println("最小公倍數:"+a*dd);
        

    }
}
class AL{
    static ArrayList arr1(int a)//A矩陣
    {
        ArrayList A=new ArrayList<>();
        for(int i=2;i<a/2;i++)
        {
            while(a%i==0)
            {
                A.add(i);
                a=a/i;
            }
        }
        if(a>1)
        {
            A.add(a);
        }
        String AS="";
        
        return A;
    }
    static ArrayList brr1(int b)//B矩陣
    {
        ArrayList B=new ArrayList<>();
        for(int i=2;i<b/2;i++)
        {
            while(b%i==0)
            {
                B.add(i);
                b=b/i;
            }
        }
        if(b>1)
        {
            B.add(b);
        }
        return B;
    }
}   