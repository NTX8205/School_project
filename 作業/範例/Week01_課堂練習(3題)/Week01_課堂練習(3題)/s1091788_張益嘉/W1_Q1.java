/*
班級:資管二B
學號:410917889
姓名:張益嘉
Q1: 判斷使用者輸入的正整數是否為質數
 */
package main;
import java.util.*;
import java.lang.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		System.out.print("可整除12的因數有");
		for(int i=1;i<=n;i++) {
			if(12%i==0) {
				System.out.print(i+" ");
			}			
		}
		System.out.println();
	     boolean b=false;  
	         b=false;
	         for(int i=2;i<n;i++){
	           if(n%i==0){
	              b=true;
	              System.out.println(n+"不是質數");
	              break;
	            }        
	         }
	         if(b == false){    
	            System.out.println(n+"是質數");
	         }	
	}
}