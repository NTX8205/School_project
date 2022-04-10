// 將使用者輸入的正整進行質因數分解
// 資管二A 410903539 王子豪
// 2022/2/23
package hw;
import java.util.*; 
public class W1_Q2 
{ 
    public static void main(String args[])
   {
        System.out.println("請輸入要分解的正整數"); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
          
        int a =2; 
        System.out.print(n+"="); 
        while(n>a)
       { 
            if(n%a==0)
           { 
                System.out.print(a+"*"); 
                n=n/a; 
            }else
             { 
                a++; 
             } 
        }
        System.out.print(n); 
    } 
} 
