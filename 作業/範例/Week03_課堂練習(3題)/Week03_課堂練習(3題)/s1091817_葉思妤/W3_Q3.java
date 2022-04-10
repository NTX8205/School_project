//Q3:璸衡3タ俱计程そ计&程そ计
//戈恨B/410918178/腑П
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class W3_Q3 
{
	public static ArrayList<Integer> A(int x)
	{
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for(int i=2;i<=x;i++)
		{
			while(x%i==0)
			{
				x/=i;
				A.add(i);
			}
		}
		
		return A;
	}
	
	public static ArrayList<Integer> B(int y)
	{
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i=2;i<=y;i++)
		{
			while(y%i==0)
			{
				y/=i;
				B.add(i);
			}
		}
		
		return B;
	}
	
	public static ArrayList<Integer> C(int z)
	{
		ArrayList<Integer> C = new ArrayList<Integer>();
		
		for(int i=2;i<=z;i++)
		{
			while(z%i==0)
			{
				z/=i;
				C.add(i);
			}
		}
		
		return C;
	}
	
	public static int gcd(ArrayList<Integer> A,ArrayList<Integer> B,ArrayList<Integer> C)
	{
		Map<Integer, Integer> common = new HashMap<>();

	    A.forEach(a -> common.merge(a, 1, Integer::sum));

	    int gcd = 1;
	    
	    for (Integer c : C) 
	    {
	        if (common.merge(c, -1, Integer::sum) >= 0) 
	        {
	        	for(Integer b :B) 
	        	{
	        		if(common.merge(b, -1, Integer::sum)>=0)
	        			gcd *=b;
	        	}
	        }
	    }
	    
	    return gcd;
	}
	
	public static int lcm(ArrayList<Integer> A,ArrayList<Integer> B,ArrayList<Integer> C)
	{
		int sum = 1;
		for(int i=0;i<A.size();i++)
			sum*=A.get(i);
		for(int j=0;j<B.size();j++)
			sum*=B.get(j);
		/*for(int k =0;k<C.size();k++)
		{
			sum*=C.get(k);
		}*/
		/*Map<Integer, Integer> once = new HashMap<>();

	    A.forEach(a -> once.merge(a, 1, Integer::sum));
	    //B.forEach(b -> common.merge(b, 1, Integer::sum));

	    int lcm = 1;
	    
	    for (Integer b : B) {
	        if (once.merge(b, -1, Integer::sum) >= 0) {
	            lcm *= b;
	        }
	    }
	    for(Integer c :C) {
    		if(once.merge(c, -1, Integer::sum)>=0) {
    			lcm *=c;
    		}
    	}*/
		return sum/gcd(A,B,C);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
          
		for(Integer integer:A(x))
		{
			System.out.print(integer+" ");
		}
		System.out.println();
		
		for(Integer integer:B(y))
		{
			System.out.print(integer+" ");
		}
		System.out.println();
		
		for(Integer integer:C(z))
		{
			System.out.print(integer+" ");
		}
		
		System.out.println();
		
		System.out.println(x+"籔"+y+"籔"+z+"程そ计"+gcd(A(x),B(y),C(z)));
		System.out.println(x+"籔"+y+"籔"+z+"程そ计"+lcm(A(x),B(y),C(z)));
		
	}
	
}
