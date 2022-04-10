//圓括號對應
//資管二A 410917774 紀若彤
//2022.03.19
import java.util.*;
public class W4_Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack<Integer> list=new Stack<>();
		
		for(int i=0; i<=s.length(); i++)
		{
			if(s.charAt(i)=='(')
			{
				list.push(i);
			}
			else if(s.charAt(i)==')')
			{
				if(list.empty())
					System.out.println("-1,"+i);
				else
					System.out.println(list.pop()+","+i);
				
			
			}
		}
		while(!list.empty())
			System.out.println(list.pop()+",-1");
		
	}

}
