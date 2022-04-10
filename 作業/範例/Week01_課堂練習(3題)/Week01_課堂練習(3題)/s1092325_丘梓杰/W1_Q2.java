//Q2: 將使用者輸入的正整進行質因數分解
//
//姓名：丘梓杰
//班別：資管二B
//學號：410923254

import java.util.*;
    public class W1_Q2 {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int q=sc.nextInt();
      System.out.print(q+"=");
    
      int g=2;
      while(g<q) {
       if(q%g==0) {
        System.out.print(g+"*");
        q=q/g;
       }else {
        g++;
        }
      }
      System.out.print(q);
    }
    }