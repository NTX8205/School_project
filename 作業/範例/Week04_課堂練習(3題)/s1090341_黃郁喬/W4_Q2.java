
/*
�D��:�e�q�M��q�M
�Z��:��ޤGA �m�W:������ �Ǹ�:410903416
 */

import java.util.*;
public class W4_Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�@�����:");
		int n = sc.nextInt();
		int count = 0;
		int []array = new int[n];
		int []pre = new int[n];
		int []post = new int[n];
		
		System.out.println("��J"+n+"�ӥ����:");
		for(int i=0; i<n; i++) 
			array[i] = sc.nextInt();
		
		for(int i=0; i<n; i++) 
			if (i==0)
				pre[i] = array[i];
			else
				pre[i] = array[i]+post[i-1];
		
		System.out.println(pre[n]);
		
		for(int i=0; i<n; i++) 
			if (i==0)
				post[i] = array[n-1];
			else
				post[i] = array[n-1]+post[n-i-1];
			
		System.out.println(post[n]);
		
			for(int i=0; i<n; i++) 
				for(int j=0; j<n; j++)
					if(pre[i] ==post[i])
					count++;
			
		System.out.println(count++);
		
	}
	
}
