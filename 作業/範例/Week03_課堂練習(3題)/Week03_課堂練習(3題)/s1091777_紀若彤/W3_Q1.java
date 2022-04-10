//排序次序
//資管二A 410917774 紀若彤
//2022.03.11
import java.util.*;
public class W3_Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int a[] = new int [n];		  int b[] = new int [n];
		  for (int i = 0; i < n ; i++){        
		  int k = (int)(Math.random()*99)+1;
		  a[i]=k;
		  b[i]=k;
		  
		 System.out.print(k+" ");
		  }
		  Arrays.sort(b);  
		  System.out.println();
		  for (int i=0; i<n ; i++){
			  for (int j=0; j<n ; j++){
				  if(a[i]==b[j]) {
					  System.out.print((j+1) + " ");
				  }
			  }
		   
		  }  
	}
}

