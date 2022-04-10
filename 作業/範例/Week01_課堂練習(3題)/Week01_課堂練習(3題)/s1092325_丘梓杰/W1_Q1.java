//Q1: 判斷使用者輸入的正整數是否為質數
//
//姓名：丘梓杰
//班別：資管二B
//學號：410923254

import java.io.*;
import java.util.*;

public class W1_Q1{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
  	int n = sc.nextInt(); //輸入
    
    ArrayList a = new ArrayList<Integer>();
  
    	for(int i=1;i<=n;i++){
        if(n%i==0){
        a.add(i);
        }
        }
        for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
        }
        System.out.println();
        if(a.size()==2){
        System.out.println(n+"是質數");  //輸出"質數"
        }
        else{
        System.out.println(n+"不是質數");  //輸出"不是質數"
        }
    }
}   
  
