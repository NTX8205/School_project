//�Z��:��ޤGB
//�Ǹ�:410918233
//�m�W:�򥰵�
//Q2: �N�ϥΪ̿�J������i���]�Ƥ���
import java.util.Scanner;
public class W1_Q2N
{
 public static void main(String[]args)
{
        Scanner in = new Scanner(System.in);
//�ϥΪ̿�J
            System.out.println("�п�J�����");

        int number = in.nextInt();
        int k =2;
        System.out.print(number + "=" );
        while(number>k)
{
            if(number%k==0)
{
                System.out.print(k+"*");
                number=number/k;
            }else
{
                k++;
                }
        }
        System.out.print(number);
}
}
