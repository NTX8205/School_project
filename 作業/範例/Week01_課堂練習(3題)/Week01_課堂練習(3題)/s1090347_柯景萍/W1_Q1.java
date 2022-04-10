//題目說明:判斷使用者輸入的正整數是否為質數
//資管二A 410903474 柯景萍
//Date:2022/02/23
package test;
import java.util.*;
public class W1_Q1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = 0;
	    for (int i = 1; i<=n;i++){        //使用FOR迴圈的演算法           
	    	if(n%i == 0){				//相除為0代表為因數，sum+1
	    		sum++;
	    	}
	    }
	    
	    if(sum ==2){				//因數只有2個為質數
	    	System.out.printf("%d是質數",n);
	    }else{
	    	System.out.printf("%d不是質數",n);
	    }
	}
}