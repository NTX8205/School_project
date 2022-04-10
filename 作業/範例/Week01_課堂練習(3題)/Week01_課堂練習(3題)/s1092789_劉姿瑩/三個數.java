/*
 Q4: 計算三個正整數的最大公因數&最小公倍數
 資管二B 410927892 劉姿瑩
 date:2022/02/28
*/

import java.util.Scanner;
public class Q4{
  
  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  int z=sc.nextInt();
		  int lcm=(x*y)/GCD(x,y);
		  System.out.println(x+"與"+y+"與"+z+"的最大公因數為"+GCD(GCD(x,y),z));
		  System.out.println(x+"與"+y+"與"+z+"的最小公倍數為"+(lcm*z)/GCD(lcm,z));
		  
	  }
	  static int GCD(int x,int y) {
		  int a;
		  a=x%y;
		  if(a==0) {
			  return y;
		  }else {
			  return GCD(y,a);
		  }
	  }	  
}