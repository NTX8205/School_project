
/*
�D��:3���X��
�Z��:��ޤGA �m�W:������ �Ǹ�:410903416
 */

import java.util.*;
public class W4_Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("�п�J�@�����:");
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