//Q2: 璸衡2タ俱计程そ计&程そ计
//戈恨A 410927907 独玜蝴
//Date:2022/3/11
import java.util.Scanner;
public class W3_Q2 
{
	public static void main(String[] args) 
	{
		System.out.print("ノㄢ计皚A,B戈ㄓ璸衡ㄢタ俱计程そ计籔程そ计");
		System.out.print("叫块ㄢタ俱计x,y");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int A[] = new int[100];
		int B[] = new int[100];
		for(int i = 0 ; i < 10000 ; i++) 
		{
			for(int j = 2 ; j < 10000 ; j++) 
			{
				if(x % j == 0) 
				{
					A[i] = j;
				}
			}
		}
	}
}
//⊿糶Ч


/*
import java.util.*;
public class Main 
{
    static void f(int x,ArrayList<Integer> o)
    {
        for(int i=2; i<=x; i++)
        {
            while(x!=i)
            {
                if(x%i==0)
                {
                    o.add(i);
                    x /= i;
                }
                else
                {
                    break;
                }
            }
        }
        o.add(x);
    }
    
     
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt(), y=sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        f(x,a);
        f(y,b);
        System.out.println(a);
        System.out.println(b);
        int GCD=1, LCM=1;
        for(int i =0; i<a.size(); i++) 
        {
            for(int j =0; j<b.size(); j++) 
            {
                if(a.get(i)==b.get(j)) 
                {
                    GCD*=a.get(i);
                    a.remove(i);
                    b.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        System.out.printf("%d籔%d程そ计%d%n",x , y, GCD);
        LCM=GCD;
        for(int q : a) 
        {
            LCM*=q;
        }
        for(int p : b)
        {
            LCM*=p;
        }
        System.out.printf("%d籔%d程そ计%d",x , y, LCM);
    }
}

把σ
*/