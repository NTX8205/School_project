/*
 Q1: 判斷使用者輸入的正整數是否為質數
 資管二B 410927892 劉姿瑩
 date:2022/02/23
*/
import java.util.*;
public class Q1{
  
  public static void main(String[] args) 
  {  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for (int i = 1; i<=n;i++ ){
    	if(n%i==0){
        	count++;            
        }
    }
    if(count==2){
    	System.out.println(n+"是質數");
    }else{
    	System.out.println(n+"不是質數");
    }    
  }
}