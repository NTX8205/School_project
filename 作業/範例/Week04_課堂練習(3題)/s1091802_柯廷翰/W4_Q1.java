package a;
//Q1:�T���X��
//��ޤGA 410918021 �_�ʿ�
//2022/3/18
import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      
      System.out.print("�п�J�@�Ӥj�󤭪������:");
      
      int n = sc.nextInt();
      int [] people = new int[n];
      int remain = n ; //�٦s���۪�
      int count = 0 ;  //����
      int out = -1 ;//�X��
      
      while (remain > 1) 
      {
          for (int i = 0; i < n; i++) 
          {
              if (people[i] != out) 
              {
                  count++;
                  if (count == 3) 
                  {
                      count = 0;
                      remain--;
                      people[i] = out;
                  }
              }
          }
      }
      
      for(int i = 0;i < n;i++)
      {
          if (people[i] != out)
          {
              System.out.println(i+1);
          }
      }
	}
}