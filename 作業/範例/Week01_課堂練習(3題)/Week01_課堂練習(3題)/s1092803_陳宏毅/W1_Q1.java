//��ޤGB 410928034 ������
//�P�_�ϥΪ̿�J������ƬO�_�����
//2022/3/1
import java.io.*;
import java.util.*;
public class W1_Q1 {
  public static void main(String[] args) {
   
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   int i,c;
   int d= 0;
   
    for (i = 1;i<=n;i++){
   	 c = n%i;
     if (c == 0){
     	 d=d+1;
     }
    } 
     if (d>2){
     	System.out.printf("%d���O���",n);
     }
     else{
     	System.out.printf("%d�O���",n);
     }
   
    
 }
}