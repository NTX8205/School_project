//Q1: 判斷使用者輸入的正整數是否為質數
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2022/2/23

import java.util.*;
public class W1_Q1{    
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();
      ArrayList a = new ArrayList<Integer>();

      for(int i=1 ; i<=n ; i++){
        if(n%i==0){
          a.add(i);
        }
      }
      for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
      }
      System.out.println();
      if(a.size()==2){
        System.out.println(n+"是質數");
      }
      else{
        System.out.println(n+"不是質數");
      }
    }  
}
