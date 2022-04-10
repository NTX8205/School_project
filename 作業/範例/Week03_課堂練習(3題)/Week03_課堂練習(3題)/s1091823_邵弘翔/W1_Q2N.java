//班級:資管二B
//學號:410918233
//姓名:邵弘翔
//Q2: 將使用者輸入的正整進行質因數分解
import java.util.Scanner;
public class W1_Q2N
{
 public static void main(String[]args)
{
        Scanner in = new Scanner(System.in);
//使用者輸入
            System.out.println("請輸入正整數");

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
