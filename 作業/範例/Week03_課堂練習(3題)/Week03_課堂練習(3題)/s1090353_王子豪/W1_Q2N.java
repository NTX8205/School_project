// �N�ϥΪ̿�J������i���]�Ƥ���
// ��ޤGA 410903539 ���l��
// 2022/2/23
package hw;
import java.util.*; 
public class W1_Q2 
{ 
    public static void main(String args[])
   {
        System.out.println("�п�J�n���Ѫ������"); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
          
        int a =2; 
        System.out.print(n+"="); 
        while(n>a)
       { 
            if(n%a==0)
           { 
                System.out.print(a+"*"); 
                n=n/a; 
            }else
             { 
                a++; 
             } 
        }
        System.out.print(n); 
    } 
} 
