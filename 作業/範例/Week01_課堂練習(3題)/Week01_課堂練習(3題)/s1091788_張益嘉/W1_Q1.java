/*
�Z��:��ޤGB
�Ǹ�:410917889
�m�W:�i�q��
Q1: �P�_�ϥΪ̿�J������ƬO�_�����
 */
package main;
import java.util.*;
import java.lang.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		System.out.print("�i�㰣12���]�Ʀ�");
		for(int i=1;i<=n;i++) {
			if(12%i==0) {
				System.out.print(i+" ");
			}			
		}
		System.out.println();
	     boolean b=false;  
	         b=false;
	         for(int i=2;i<n;i++){
	           if(n%i==0){
	              b=true;
	              System.out.println(n+"���O���");
	              break;
	            }        
	         }
	         if(b == false){    
	            System.out.println(n+"�O���");
	         }	
	}
}