//Q2: 計算2個正整數的最大公因數(gcd)&最小公倍數(lcm)
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2002/03/09

import java.util.*;
public class W3_Q2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("請輸入兩個正整數:");

        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=x*y;
        int gcd=1;
        int lcm=1;
        
        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
        
        if(y>x)
        {
            int tmp=y;
            y=x;
            x=tmp;
        }
        for(int i=2 ;i<=x ;)
        {
            if(x!=1)
            {
                if(x%i==0)
                {
                    a.add(i);
                    x/=i;
                }
                else
                {
                    i++;
                }
            }
        }
        for(int i=2 ;i<=y ;)
        {
            if(y!=1)
            {
                if(y%i==0)
                {
                    b.add(i);
                    y/=i;
                }
                else
                {                          //index     0 1 2 3
                    i++;                   //2 3 3 a   2 2 3 
                }                          //2 3 5 b   2 3 3 5
            }
        }                           
                                                     
        for(int i=0 ;i<a.size();i++)     
        {
            for(int j=0 ;j<b.size() ;j++)
            {
                if((int)a.get(i)==(int)b.get(j))
                {
                    gcd*=(int)a.get(i);
                    a.set(i,0);
                    b.set(j,-1);    
                }
            }  
        }
        lcm=c/gcd;

        System.out.println("最大公因數為: "+gcd);
        System.out.println("最小公倍數為: "+lcm);
    }
}