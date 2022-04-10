//資管二B 410928034 陳宏毅
//判斷使用者輸入的正整數是否為質數
//2022/3/1
import java.io.*;
import java.util.*;
public class W1_Q1 {
  public static void main(String[] args) {
   
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   int i,c;
   int d= 0;
   
    for (i = 1;i<=n;i++){
   	 c = n%i;
     if (c == 0){
     	 d=d+1;
     }
    } 
     if (d>2){
     	System.out.printf("%d不是質數",n);
     }
     else{
     	System.out.printf("%d是質數",n);
     }
   
    
 }
}