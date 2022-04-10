
/*
題目:3號出局
班級:資管二A 姓名:黃郁喬 學號:410903416
 */

import java.util.*;
public class W4_Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一正整數:");
        int n = sc.nextInt();
        int [] people = new int [n];
        int remain = n;
        int count = 0;
        
        while(remain>1){
            for(int i=0; i<n; i++){
                if(people[i] != -1){
                    count++;
                    if(count==3){
                    	count=0;
                        remain--;
                        people[i] = -1;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            if(people[i] != -1){
                System.out.println(i+1);
            }
        }
    }
}