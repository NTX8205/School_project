//Q3: 計算3個正整數的最大公因數(gcd)&最小公倍數(lcm)
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2002/03/09

import java.util.*;
public class W3_Q3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
      
        System.out.println("請輸入三個正整數:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int tmp;
        int gcd=1;
        int gcd1=1;
        int lcm=1;

        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
        ArrayList c=new ArrayList();
        ArrayList d=new ArrayList();

        
        if(y>x && x>z)
        {
            tmp=x; x=y; y=x;
        }
        else if(y>x && z>x && y>z) 
        {
            tmp=x; x=y; y=z; z=x;
        }
        else if(z>x && x>y)
        {
            tmp=x; x=z; z=y; y=x;
        }
        else if(z>x && y>x && z>y)
        {
            tmp=x; x=z; z=x; 
        }
        else if(y<z)
        {
            tmp=y; y=z; z=y;
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
                {
                    i++;
                }
            }
        }
        for(int i=2 ;i<=z ;)
        {
            if(z!=1)
            {
                if(z%i==0)
                {
                    c.add(i);
                    z/=i;
                }
                else
                {
                    i++;
                }
            }
        }
  
        for(int i=0;i<a.size();i++)
        {
            if((int)a.get(i)==(int)b.get(i)&&(int)b.get(i)==(int)c.get(i))
            {
                lcm*=(int)a.get(i);
            }
            else if((int)a.get(i)==(int)b.get(i) &&(int)b.get(i)!=(int)c.get(i))
            {
                lcm*=(int)a.get(i)*(int)c.get(i);
            }
            else if((int)a.get(i)!=(int)b.get(i) &&(int)b.get(i)==(int)c.get(i))
            {
                lcm*=(int)a.get(i)*(int)b.get(i);
            }
            else if((int)a.get(i)!=(int)c.get(i) &&(int)b.get(i)!=(int)c.get(i))
            {
                lcm*=(int)a.get(i)*(int)b.get(i);
            }
            else if((int)a.get(i)!=(int)c.get(i) &&(int)b.get(i)!=(int)c.get(i)&&(int)a.get(i)!=(int)b.get(i))
            {
                lcm*=(int)a.get(i)*(int)b.get(i)*(int)c.get(i);
            }
        }
        for(int i=0 ;i<a.size();i++)     
        {
            for(int j=0 ;j<b.size() ;j++)
            {
                if((int)a.get(i)==(int)b.get(j))
                {
                    gcd*=(int)a.get(i);
                    d.add(a.get(i));
                    a.set(i,0);
                    b.set(j,-1);    
                }
            }  
        }

        for(int i=0 ;i<c.size();i++)              //2*3*3  
        {                                         //2*3*5
            for(int j=0 ;j<d.size() ;j++)         //2*3*5
            {
                if((int)c.get(i)==(int)d.get(j))
                {
                    gcd1*=(int)c.get(i);
                    c.set(i,0);
                    d.set(j,-1);    
                }
            }  
        }
        
        System.out.println("最大公因數為"+gcd);
        System.out.println("最小公倍數為"+lcm);
    }
}

 