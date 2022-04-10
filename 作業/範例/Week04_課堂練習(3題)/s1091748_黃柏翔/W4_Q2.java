//410917481 黃柏翔
//Q2: 前段和與後段和
import java.util.*;
public class W4_Q2 {
	int headtail(int f[], int n)
	{
	 int pre = 0, suf = n-1, presum = 0, sufsum = 0, count = 0;
	 while( pre < n && suf >= 0)
	  if(presum > sufsum)
	   sufsum += f[suf--];
	  else if(sufsum > presum)
	   presum += f[pre++];
	  else
	  {
	   count++;
	   sufsum += f[suf--];
	   presum += f[pre++];
	  }
	 return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] x = new int[n];
		 for(int i = 0 ; i<x.length ;i++) {
			 x[i] = sc.nextInt();			
		 }	 
	}
}
