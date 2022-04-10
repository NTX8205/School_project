//Q1: 判斷使用者輸入的正整數是否為質數
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:2/23

package W1_Q1;
import java.util.*;
public class W1_Q1 {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	   for(int i=2; i<n; i++) {
		  if(n%i==0) {
	      System.out.println("不是質數");
	     return;
		  } 
	   }
		  System.out.println("質數");
		 
		   
		   }  
		 }  

