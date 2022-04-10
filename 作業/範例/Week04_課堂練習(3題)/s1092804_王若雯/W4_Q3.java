//W4_Q3: 圓括號對應 Parenthesis Matching
//系級:資管二A  學號:410928042  姓名:王若雯
import java.util.*;
public class W4_Q3
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		//  "("=40; ")"=41;
		String str = sc.nextLine();
		
		char [] char_str = str.toCharArray();
		
		for(int i=0; i<char_str.length; i++) 		//run全部str
		{
			int count1 =0,count2=0;
			if (char_str[i] == ')' ) { 				//找 右括號)
				count1++;
				for(int j=i-1; j>=0; j--)
				{
					if (char_str[j] == '(' ) { 		//找 左括號(
					
						System.out.print("(--)"+j+","+i+"\n");
						char_str[j]='a'; 	
						count2++;					//找到 左括號( 後歸零
						break;
					}		
					if(j==0 && count1==1 ) {
						System.out.print("有右邊沒左邊"+"-1,"+i+"\n");
					}
					else if(count1==1 && count2==0) 
					{
						System.out.print("有左邊沒右邊"+j+",-1"+"\n");
					}
				}
				
			}
		}
	}
}