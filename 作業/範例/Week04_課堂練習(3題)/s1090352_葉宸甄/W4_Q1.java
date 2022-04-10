//題目：三號出局
//班級：資管二B 學號：410903521 姓名：葉宸甄
//日期：3/16 W4_Q1
package test6;
import java.util.*;
public class W4_Q1 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] people = new int[n];
       int remain = n ; //還存活著的
       int count = 0 ;  //報數
       int out = -1 ;//出局
while (remain > 1) {
           for (int i = 0; i < n; i++) {
               if (people[i] != out) {
                   count++;
                   if (count == 3) {
                       count = 0;
                       remain--;
                       people[i] = out;           
                   }
}
           }
       }
           for(int i=0;i<n;i++)
           {
               if (people[i]!=out)
               {
                   System.out.println((i+1));
               }
           }
    }
 }

