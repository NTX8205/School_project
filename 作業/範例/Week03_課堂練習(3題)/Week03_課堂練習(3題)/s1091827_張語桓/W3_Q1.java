//題目說明：排序次序
//資管二B 410918275 張語桓
import java.util.*;
public class W3_Q1 
{
     public static void main(String[] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 Random rand=new Random();
    	 int n=sc.nextInt();
    	 int arr1[]=new int[n];
    	 int arr2[]=new int[n];
    	 System.out.print("隨機產生正整數：");
    	 
    	 if(n<=10)
    	 {
    	 for(int i=0;i<n;i++) 
    	 {
    		int x=rand.nextInt(100);
    		arr1[i]=x;
    		arr2[i]=arr1[i];
    	 }
    	 }
    	 System.out.println(Arrays.toString(arr1));
    	 
    	 Arrays.sort(arr2);
    	 
    	 System.out.print("排序後索引次序為：");
 	     for(int i=0;i<arr1.length;i++) 
 	     {
 	    	for(int j=0;j<arr2.length;j++)
 	    	{
 	    		if(arr1[i]==arr2[j]) 
 	    		{
 	    			System.out.print(j+1);
 	    		}
 	    	}
 	     }
     }
}
