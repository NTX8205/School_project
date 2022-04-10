//
//Q3: 圓括號對應 Parenthesis Matching
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W4_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		char[] charArray = new char[a.length()];
	
	
		for (int i = 0; i < a.length(); i++) 
        {
			charArray[i] = a.charAt(i);
            int ch1 = charArray[i];
			
			if(charArray[i] != 0)
            {
                
                if(ch1 == 40)
                {
                	for(int j = 0; j < a.length(); j++)
            		{
                		charArray[j] = a.charAt(j);
                		int ch2 = charArray[j];
                    	
                    	if(charArray[j] != 0)
                    	{
                    		if((ch1+ch2) == 80)
                        	{
                        		i = j;
                        		continue;
                        	}
                        	if((ch1+ch2) == 81)
                        	{
                        		charArray[i] = 0;
                        		charArray[j] = 0;
                        		System.out.printf("%d, %d%n", i, j);
                        		i = j;
                        		break;
                        	}
                    	}
            		}
                }
            }
        }
		
		
	}
}

