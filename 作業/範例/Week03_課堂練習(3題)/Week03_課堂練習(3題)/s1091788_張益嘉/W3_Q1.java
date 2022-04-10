/*班級:資管二B
學號:410917889
姓名:張益嘉
Q1:: 排序次序*/
package W3;
import java.util.*;
public class W3_Q1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個小於10正整數");
		
		int n=sc.nextInt();	
		int ran[]=new int[n];
		int ne[]= Arrays.copyOf(ran,ran.length);
		
		System.out.println("1~100隨機取數為");
		for(int i=0;i<n;i++)
		{
			ran[i]=(int)(Math.random()*100)+1;
			System.out.print(ran[i]+" ");					
		}    
		System.out.println("");
		

		Arrays.sort(ne);
		/*for(int z=0;z<n;z++)
		{	
			System.out.println(ne[z]+(z+1));
		}
		

		/*for(int z=1;z<=n;z++) //名次
		{
			ne[z]=z;
			System.out.print(z);
		}*/
	
		/*for(int k:ran) //比對
		{
			for(int j=0;j<n;j++)
			{			
				if(ne[j]==k)
				{
					
				}
			}			
		}*/
	}
}