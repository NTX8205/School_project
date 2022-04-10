/*
 Q3:璸衡3タ俱计程そ计&程そ计
 戈恨B 410927892 糂键
 date:2022/03/15
*/
import java.util.*;
public class W3_Q3 
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
        int x = sc.nextInt(), y=sc.nextInt(),z=sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        f(x,a);
        f(y,b);
        f(z,c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int GCD=1, LCM=1;
        for(int i =0; i<a.size(); i++) 
        {
            for(int j =0; j<b.size(); j++) 
            {
            	if(a.get(i)==b.get(j)) 
            	{
            		d.add(a.get(i));
		            a.remove(i);
		            b.remove(j);
		            i--;
		            j--;
		            break;
            	}
                
            }
        }
        for(int i=0;i<d.size();i++) 
        {
        	for(int k =0;k<c.size(); k++) 
        	{
        		if(d.get(i)==c.get(k)) 
        		{
        			GCD*=c.get(i);
                    d.remove(i);
                    c.remove(k);
                    i--;
                    k--;
                    break;
        		}
            }
        }
        
        System.out.printf("%d籔%d籔%d程そ计%d%n",x , y,z, GCD);
    }
}