//Q3:�p��3�ӥ���ƪ��̤j���]��&�̤p������
//��ޤGA 410921862 ���s��
//2022/3/15
import java.util.Arrays;
import java.util.Scanner;
public class W3_Q3 {
	public static void main(String[] args) {
		    {
		        Scanner sc = new Scanner (System.in);
		        int a = sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		        int q=2; int GCD=1; int LCM=1;
		        int X=a; int Y=b; int Z=c;
		        while(X>=q && Y>=q && Z>=q) 
		        {
		            if(X%q==0 && Y%q==0 && Z%q==0) 
		            {
		                GCD=q;
		                LCM=q;
		                X/=q;
		                Y/=q;
		                Z/=q;
		            }
		            else if(X%q==0 && Y%q==0)
		            {
		                LCM=q;
		                X/=q;
		                Y/=q;
		            }
		            else if(X%q==0 && Z%q==0)
		            {
		                LCM=q;
		                X/=q;
		                Z/=q;
		            }
		            else if(Z%q==0 && Y%q==0)
		            {
		                LCM=q;
		                Z/=q;
		                Y/=q;
		            }
		            else
		            {
		                q++;
		            }
		        }
		        LCM=LCM*X*Y*Z;
		        System.out.printf("%d�P%d�P%d���̤j���]�Ƭ�%d%n",a , b, c, GCD);
		        System.out.printf("%d�P%d�P%d���̤p�����Ƭ�%d",a , b, c, LCM);
		    }
		}

	}