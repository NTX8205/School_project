/*
  	日期:2022/02/23
 	題目:1.判斷使用者輸入的正整數是否為質數
	班級:資管二A
	學號:410918209
	姓名:劉京婷
 */

import java.util.*;
public class W1_Q1 {
	public static void main(String args[]) {
	  	Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int count=0;
	    
	    for(int i=1;i<=n;i++){
	    	if(n%i==0){
	            count+=1;
	    	}
	    }
	    if(count==2) {
	    	System.out.println("是質數");
	    }
	    else {
	    	System.out.println("不是質數");
	    }
	}
}
