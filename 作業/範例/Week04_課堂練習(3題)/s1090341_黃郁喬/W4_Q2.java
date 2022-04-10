
/*
題目:前段和後段和
班級:資管二A 姓名:黃郁喬 學號:410903416
 */

import java.util.*;
public class W4_Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = sc.nextInt();
		int count = 0;
		int []array = new int[n];
		int []pre = new int[n];
		int []post = new int[n];
		
		System.out.println("輸入"+n+"個正整數:");
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
