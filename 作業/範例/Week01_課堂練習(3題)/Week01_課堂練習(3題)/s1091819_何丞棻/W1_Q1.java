//Q1: 判斷使用者輸入的正整數是否為質數
//資管二B 何丞棻 410918194
//Date:2022/02/23
import java.util.*;
public class W1_Q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        
        for(int i=1;i<=n;i++){
        	if(n%i==0){
            	count++;
            }
        }
        
        if(count==2){
        	System.out.printf("%d是質數",n);
        }else{
        	System.out.printf("%d不是質數",n);
        }
        
    }
}