//Q1: �P�_�ϥΪ̿�J������ƬO�_�����
//�Z��:���2B
//�Ǹ�:410918233
//�m�W:�򥰵�
//Date:2022/02/23
import java.io.*;
import java.util.Scanner;
public class W1_Q1N
{
  public static void main(String[] args) 
 {
  	Scanner sc=new Scanner(System.in);
    //���ܨϥΪ̿�J�����
    System.out.println("�п�J�����");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
    	if(n%i==0)
        {
        	sum+=1;
        }
    }
    if(sum==2) 
    {
    	System.out.printf("%d�O���",n);
    }
    else
    {
    	System.out.printf("%d���O���",n);
    }
  }
}
