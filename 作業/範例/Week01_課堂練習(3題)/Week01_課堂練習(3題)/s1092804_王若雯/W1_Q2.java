//Q2: 將使用者輸入的正整進行質因數分解
//
//系級:資管二A
//學號:410928042
//姓名:王若雯
import java.util.*;
public class W1_Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int i=2;
        
        System.out.print(n+"=");
        
        while(i<=n){
        	        	
	        if(n%i==0){
	        	if(i<n){
		            System.out.print(i+"*");
	            }else if(i==n){
		        	System.out.println(i);
		        }
	        	n=n/i;
	            i=2;        
	        }else {
	        	i++;
	        }
        }
    }
}
