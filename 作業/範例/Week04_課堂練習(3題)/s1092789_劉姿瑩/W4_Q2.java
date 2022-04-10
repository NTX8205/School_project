/*
 Q2: 前段和與後段和
 資管二B 410927892 劉姿瑩
 date:2022/03/22
*/
import java.util.*;
public class W4_Q2 
{

	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  int n = sc.nextInt();
		  int count = 0;
		  int[] arr = new int[n];
		  
		  for(int i=0;i<n;i++)
		  {
			  arr[i] = sc.nextInt();
		  }
		  int b = arr[0];
		  list.add(b);
		  for(int i=1;i<n;i++)
		  {
			  b+=arr[i];
			  list.add(b);
		  }
		  b = arr[n-1];
		  for(int i=n-2;i>=0;i--)
		  {
			  if(list.contains(b))
				  count++;
			  b+=arr[i];
		  }
		  if(list.contains(b))
			  count++;
		  System.out.print(count);
		 
	}
}
