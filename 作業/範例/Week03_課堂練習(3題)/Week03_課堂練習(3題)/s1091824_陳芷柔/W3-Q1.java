//排序次序
//資管二A 410918241 陳芷柔
//Date：2022/03/15
import java.util.*;
public class AA {
 public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  System.out.println("請輸入一個4 ~ 6 間的正整數");
  
  int n=sc.nextInt();
  int [] Array = new int [n] ;
  int [] index = Array;
  int min = 1;
  
  for(int i=0;i<Array.length;i++) {
   Array[i] = (int)(Math.random()*100)+1;
   System.out.printf(Array[i]+" ");
  }
  
  System.out.println();
  
   for(int i=0;i<100;i++) {
    for(int j=0;j<n;j++){
     if(Array[j]==i) {
      index[j] = min;
      for(int x=0;x<n;x++) {
       if(Array[x]==i) {
        index[x]=min;
       }
      }
      min++;
     }
    }
    
   }
   
   for(int i=0;i<n;i++) {   
    System.out.print(Array[i]+"  ");
   }
 }
}