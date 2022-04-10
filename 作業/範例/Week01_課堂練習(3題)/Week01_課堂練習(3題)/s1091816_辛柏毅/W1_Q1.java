//Q1: 判斷使用者輸入的正整數是否為質數
//資管二A 410918160 辛柏毅
//Date_20220223


import java.util.*;
public class W1_Q1
{

  public static void main(String[] args) 
  {  	
	  System.out.print("請輸入一個數字");
	  Scanner sc = new Scanner(System.in);	
	  int n = sc.nextInt();
	  
	  System.out.print("可整除12的因數有");
	  	for(int i = 1; i<=n ; i++){
  		if(n%i==0){
        int k = i;
        if(i<n){
		System.out.print(i+",");
        }
        else if(i==n){
        System.out.print(i);
        }
        else{
        break;
        }
    }
    }
    }
    }