//Q1: 判斷使用者輸入的正整數是否為質數
//班級:資管2B
//學號:410918233
//姓名:邵弘翔
//Date:2022/02/23
import java.io.*;
import java.util.Scanner;
public class W1_Q1N
{
  public static void main(String[] args) 
 {
  	Scanner sc=new Scanner(System.in);
    //提示使用者輸入正整數
    System.out.println("請輸入正整數");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
    	if(n%i==0)
        {
        	sum+=1;
        }
    }
    if(sum==2) 
    {
    	System.out.printf("%d是質數",n);
    }
    else
    {
    	System.out.printf("%d不是質數",n);
    }
  }
}
