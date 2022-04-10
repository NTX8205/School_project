//Q1:三號出局
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:3/18 W4_Q1;
import java.util.Scanner;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int count = 0,max = n;
         
         while(n > 1) 
         {
             for(int i=0; i<max; i++) 
             {
                 if(list[i] != -1) 
                 {
                     count++;
                     if(count == 3) 
                     {
                         count = 0;
                         n--;
                         list[i] = -1;
                     }
                 }
              }   
          }
    for(int i=0; i<list.length; i++) 
    {
        if(list[i] != -1)
        System.out.println(i+1);
    }

	}

}
