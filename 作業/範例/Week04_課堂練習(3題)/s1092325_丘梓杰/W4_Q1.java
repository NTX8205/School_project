//Q1: 三號出局
//
//姓名：丘梓杰
//班別：資管二B
//學號：410923254

import java.util.*;
public class W4_Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int xy=sc.nextInt();
        int[]people=new int[xy];
        int remain=xy;
        int count=0;
        
        while(remain>1){
            for(int i=0;i<xy;i++){
                if(people[i]!=-1){
                    count++;
                    if(count==3){
                        count=0;
                        remain--;
                        people[i]=-1;
                    }
                }
            }
        }
        for(int i=0;i<xy;i++){
            if(people[i]!=-1){
            System.out.println(i+1);
            }
        }
    }
}