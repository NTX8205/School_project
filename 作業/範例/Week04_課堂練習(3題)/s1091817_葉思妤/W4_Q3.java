//Q3:圓括號對應Parenthesis Matching
//資管二B/410918178/葉思妤

import java.util.*;

public class W4_Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = new char[40];
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			c[i] = str.charAt(i);
			
			if(c[i] == '(')
		   	{
			   s.push(i);
			   if(i == c.length-1)
				   System.out.println(s.pop() + "," + (-1));
		    }

		    if(c[i] == ')')
		   	{
		  	   if( s.empty() )
		  	     	s.push(-1);
			   System.out.println(s.pop() + "," + i);
		    }
		}
		
		if (!s.empty())
		{
			while(!s.empty())
				System.out.println(s.pop() + "," + (-1));
	    }

	}
}
