/*����� 410917821 Q1 */
import java.io.*;
import java.util.Scanner;
public class homework {
	
	public static void main(String[] args){  
  	Scanner sc = new Scanner(System.in);
    System.out.println("�п�J�����n:");
  	double number = sc.nextDouble();
  	double remainder = 0;
  	double factor = 0;
  //�p��]�ƭӼ�
  	for(int i = 1 ; i <= number ; i++){
  	 remainder = number % i;
   	if(remainder == 0)
   {
    factor = factor + 1;
   	}
   }
  //�P�_�O�_����ƨæL�X���G
 	 if(factor == 2 ){
   		System.out.println("���Ƭ����");
  	}else{
  	 	System.out.println("���Ƥ������");
 		 }
  
  }
}
