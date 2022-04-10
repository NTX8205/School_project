//Q1: 判斷使用者輸入的正整數是否為質數
//
//系級:資管二A
//學號:410928042
//姓名:王若雯
import java.util.*;
public class W1_Q1 {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);	
		
	    int n = sc.nextInt();
	    int count=0;
	   
	    for(int i=1;i<n;i++){
	        if(n%i==0){
	            count++;
	        }
	    }
	    
	    if(count>2){
	        System.out.println(n+"不是質數");
	        }else{
	        System.out.println(n+"是質數");
	    }
	}
}