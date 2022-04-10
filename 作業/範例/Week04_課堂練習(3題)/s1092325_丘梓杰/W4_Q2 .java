//Q2: 前段和與後段和
//
//姓名：丘梓杰
//班別：資管二B
//學號：410923254

import java.util.*;
public class W4_Q2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x[]=new int[5];
        for(int i=0;i<20;i++){
            switch(sc.nextInt()/10){
                case 10: case 9:x[0]++;break;
                case 8:x[1]++;break;
                case 7:x[2]++;break;
                case 6:x[3]++;break;
                default:x[4]++;break;
            } 
        }
        int n=x[0];
        for(int i=1;x<x.length;i++){
            if(n<x[i]){
                n=x[i];
            }
        }
        for(int i=n;i>0;i--){
            for(int j=4;j>=0;j--){
                if(x[j]=i){
                    System.out.println("* ");
                }
            }
        }
        System.out.println("3");    
    }
}