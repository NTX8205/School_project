//W4_Q3: ��A������ Parenthesis Matching
//�t��:��ޤGA  �Ǹ�:410928042  �m�W:���Y��
import java.util.*;
public class W4_Q3
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		//  "("=40; ")"=41;
		String str = sc.nextLine();
		
		char [] char_str = str.toCharArray();
		
		for(int i=0; i<char_str.length; i++) 		//run����str
		{
			int count1 =0,count2=0;
			if (char_str[i] == ')' ) { 				//�� �k�A��)
				count1++;
				for(int j=i-1; j>=0; j--)
				{
					if (char_str[j] == '(' ) { 		//�� ���A��(
					
						System.out.print("(--)"+j+","+i+"\n");
						char_str[j]='a'; 	
						count2++;					//��� ���A��( ���k�s
						break;
					}		
					if(j==0 && count1==1 ) {
						System.out.print("���k��S����"+"-1,"+i+"\n");
					}
					else if(count1==1 && count2==0) 
					{
						System.out.print("������S�k��"+j+",-1"+"\n");
					}
				}
				
			}
		}
	}
}