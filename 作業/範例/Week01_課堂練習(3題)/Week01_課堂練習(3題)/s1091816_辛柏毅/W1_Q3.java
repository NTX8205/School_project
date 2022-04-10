//Q3: 計算兩個正整數的最大公因數&最小公倍數
//資管二A 410918160 辛柏毅
//Date_20220223

import java.util.*;

public class W1_Q3
{
 
  public static void main(String[] args) 
  {  
	  System.out.println("請輸入兩個數字");
	  
	  Scanner sc = new Scanner(System.in);	
	  int x = sc.nextInt();
	  int y = sc.nextInt();
	  
	  int ball = 0,x1=x,y1=y;
	  
	  	while(x % y != 0){
	  		ball = y;
	  		y = x % y;
	  		x = ball;
	  						}
    
      int tmp = 0;
      	while(x % y != 0){
		 	tmp = y;
		 	y = x % y;
			x = tmp;
      						}
      System.out.println("18與30的最大公因數為"+y);
      System.out.println("18與30的最小公倍數為"+ x1*y1/y);
 
  		}
	}
