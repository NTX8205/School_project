//Q1: 判斷使用者輸入的正整數是否為質數
//班級:資管2B
//學號:410918233
//姓名:邵弘翔
//Date:2022/02/23
import java.io.*;
import java.util.Scanner;
public class Q1 {
  public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
    	if(n%i==0){
        	sum+=1;
        }
    }
    if(sum==2) {
    	System.out.printf("%d是質數",n);
    }
    else{
    	System.out.printf("%d不是質數",n);
    }
  }
}
