//資管二B-410903482-許雁庭
//Q1：判斷使用者輸入的正整數是否為質數

import java.util.*;
public class Q1 {
	public static void main (String[] args) {
    	Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i <= n ; i++){//1~n
        	if(n%i == 0){//判斷是否整除
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
