//Q2:璸衡2タ俱计程そ计&程そ计
//戈恨A 410921862 尝﹕
//2022/3/15
import java.util.*;
public class W3_Q2 
{
    static void k(int a,ArrayList<Integer> o)
    {
        int x = 0; 
		for(int i=2; i<=x; i++)
        {
            while(a!=i)
            {
                if(a%i==0)
                {
                    o.add(i);
                    a /= i;
                }
                else
                {
                    break;
                }
            }
        }
        o.add(a);
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt(), b=sc.nextInt();
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        k(a,x);
        k(b,y);
        System.out.println(x);
        System.out.println(y);
        int GCD=1, LCM=1;
        for(int i =0; i<x.size(); i++) 
        {
            for(int j =0; j<y.size(); j++) 
            {
                if(x.get(i)==y.get(j)) 
                {
                    GCD=y.get(i);
                    x.remove(i);
                    y.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        System.out.printf("%d籔%d程そ计%d%n",a , b, GCD);
        LCM=GCD;
        for(int q : x) 
        {
            LCM=q;
        }
        for(int p : y)
        {
            LCM=p;
        }
        System.out.printf("%d籔%d程そ计%d",a , b, LCM);
    }
}