//��ޤGB-410903482-�\���x
//Q1�G�P�_�ϥΪ̿�J������ƬO�_�����

import java.util.*;
public class Q1 {
	public static void main (String[] args) {
    	Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i <= n ; i++){//1~n
        	if(n%i == 0){//�P�_�O�_�㰣
            	count++;
            }
        }
        if(count>2){
        	System.out.println(n+"���O���");
        }else{
            System.out.println(n+"�O���");
        }
	}
}
