//Q3:圓括號對應
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:3/21 W4_Q3;
import java.util.Scanner;
import java.util.Stack;
public class W4_Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		String str = sc.next();
		char[] s1 = str.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i]=='(') 
			{
				stack.push(i);
			}
			if(s1[i]==')') 
			{
				if(stack.isEmpty()== true) 
				{
					System.out.println("-1,"+i);
				}
				else 
				{
					System.out.println(stack.pop()+","+i);
				}
			}
		}
		while(stack.isEmpty() != true)
		{
			System.out.println(stack.pop() + ",-1");
		}
	}
}
