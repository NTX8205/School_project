//題目說明：輸入正整數進行質因數分解
//資管二B 410918275 張語桓
//Date:2022/02/27

import java.util.*;
public class W1_Q2 {
	public static void main(String[] args) {
   	 Scanner sc=new Scanner(System.in);
   	 int n= sc.nextInt();
   	 System.out.print(n+"=");
   	 
   	 for(int i=2;i<=n;i++) {
   		 while(n!=i) {
   			 if(n%i==0) {
   				 System.out.print(i+"*");
   				 n/=i;
   			 }else {
   				 break;
   			 }
   		 }
   	 }
   	 System.out.print(n);
    }
}
