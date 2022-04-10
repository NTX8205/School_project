package a;
//Q1:三號出局
//資管二A 410918021 柯廷翰
//2022/3/18
import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      
      System.out.print("請輸入一個大於五的正整數:");
      
      int n = sc.nextInt();
      int [] people = new int[n];
      int remain = n ; //還存活著的
      int count = 0 ;  //報數
      int out = -1 ;//出局
      
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