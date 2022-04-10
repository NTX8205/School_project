/*
 Q3: 計算兩個正整數的最大公因數&最小公倍數
 資管二B 410927892 劉姿瑩
 date:2022/02/25
*/
//方法一：遞迴
import java.util.Scanner;
public class Q3{
  
  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  System.out.println(x+"與"+y+"的最大公因數為"+GCD(x,y));
		  System.out.println(x+"與"+y+"的最小公倍數為"+(x*y)/GCD(x,y));
	  }
	  static int GCD(int x,int y) {
		  int z;
		  z=x%y;
		  if(z==0) {
			  return y;
		  }else {
			  return GCD(y,z);
		  }
	  }	  
}
//方法二：一個迴圈
/*
import java.io.*;
import java.util.*;

public class Q3 {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();
		  int y=sc.nextInt(),temp=0;		  
		  int a=x*y,x1=x,y1=y;
		  
		  while(x%y!=0) {
			  temp=x%y;
			  x=y;
			  y=temp;
		  }
		  System.out.println(x1+"與"+y1+"的最大公因數為"+y);
		  System.out.println(x1+"與"+y1+"的最小公倍數為"+(a/y));
		  
	  }
}
*/