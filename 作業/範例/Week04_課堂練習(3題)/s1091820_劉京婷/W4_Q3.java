/*
 	���:2022/03/16
 	�D��:3.��A������Parenthesis Matching
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
	
	����:(a+(b*c)/(d-e)+f)
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
		System.out.println("�п�J�@�ӥ]�t��A�����B�⦡�A���פp�󵥩�40");
		String s=sc.next();
		char a[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) 
		{
			if(a[i]==')') 
			{
				for(int j=i;j>=0;j--) 
				{
					if(a[j]=='(') //��̾a��k�A�������A��
					{  
						System.out.println(j+","+i);
						a[i]='a'; //i��m���A�����������O�A�����줸
						a[j]='a'; //j��m���A�����������O�A�����줸
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
					if(a[j]!='(') //��̾a��k�A�������A��
					{  
						System.out.println("-1"+","+i);
						a[i]='a'; //i��m���A�����������O�A�����줸
						break;
					}
				}
			}
			if(a[i]=='(') 
			{
				for(int j=i;j>=0;j--) 
				{
					if(a[j]!=')') //��̾a��k�A�������A��
					{  
						System.out.println(i+","+"-1");
						a[i]='a'; //i��m���A�����������O�A�����줸
						break;
					}
				}
			}
		}
	}
}
