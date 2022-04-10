/*
 	日期:2022/03/16
 	題目:3.圓括號對應Parenthesis Matching
	班級:資管二A
	學號:410918209
	姓名:劉京婷
	
	測資:(a+(b*c)/(d-e)+f)
		3,7
		9,13
		0,16
		((a+b)-c*e)+(e*(f-g)
		1,5
		0,10
		15,19
		12,-1
	
 */
import java.util.*;
public class W4_Q3 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個包含圓括號的運算式，長度小於等於40");
		String s=sc.next();
		char a[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) 
		{
			if(a[i]==')') 
			{
				for(int j=i;j>=0;j--) 
				{
					if(a[j]=='(') //找最靠近右括號的左括號
					{  
						System.out.println(j+","+i);
						a[i]='a'; //i位置的括號替換成不是括號的位元
						a[j]='a'; //j位置的括號替換成不是括號的位元
						break;
					}
				}
			}
		}
		
		for(int i=0;i<s.length();i++) 
		{
			if(a[i]==')') 
			{
				for(int j=i;j>=0;j--) 
				{
					if(a[j]!='(') //找最靠近右括號的左括號
					{  
						System.out.println("-1"+","+i);
						a[i]='a'; //i位置的括號替換成不是括號的位元
						break;
					}
				}
			}
			if(a[i]=='(') 
			{
				for(int j=i;j>=0;j--) 
				{
					if(a[j]!=')') //找最靠近右括號的左括號
					{  
						System.out.println(i+","+"-1");
						a[i]='a'; //i位置的括號替換成不是括號的位元
						break;
					}
				}
			}
		}
	}
}
