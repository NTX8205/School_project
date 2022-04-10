//Q1: 排序次序
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:3/10 W3_Q1;
import java.util.*;
public class W3_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();  
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
        for(int i=0;i<n;i++) 
        {
        int k =rand.nextInt(100);
        a[i]=k;
        b[i]=k;
        System.out.print(k+" "); 
        }
        Arrays.sort(b);
        System.out.println(); 
        
        for(int i=0;i<n;i++) 
        {
        for(int j=0; j<n; j++) 
        {
        	 if(a[i]==b[j]) 
        	 {
         System.out.print((j+1)+" "); 
              }
       
	
        }
        }
    }
}
