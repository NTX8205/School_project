//Q1: �ƧǦ���
//��ޤGA 410927907 ���a��
//Date:2022/3/11
import java.util.Random;
import java.util.Scanner;
public class W3_Q1
{
	public static void main(String[] args) 
	{
		System.out.println("�ϥΪ̿�J�@�ӥ����n, �䤤n<=10. �Q�ζü��H������n�Ӥ���1~100������ƨ��x�s��@���}�C��");
		System.out.print("�п�J�@���n:");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = sc.nextInt();
		double arr[] = new double[11];
		double num[] = new double[n];//�������ޭ�
		for(int i = 0; i < 10 ; i++) 
		{
			arr[i] = (int)(r.nextInt(100)+1);
			if(i >= 1)
				for(int j = i-1 ; j<i ; j++) {//�P�_�O�_����
					if(arr[j] == arr[i]) {
						i--;
					}
				}
		}
		System.out.print("����Ƥ��O��: ");
		for(int i = 0; i < n ; i++) 
		{
				num[i] = (int)(r.nextInt(n)+1);//���ޭȥѦ��}�l�O��
                for (int j = 0; j < i; j++) 
                {
                    while (num[j] == num[i])
                    {
                        j = 0;  
                        num[i] = (int)(r.nextInt(n)+1);//�P�_�O�_����
                    }

                }	
                System.out.print((int)arr[(int)num[i]]+" ");//�H�����ͪ��}�C�����
		}
		System.out.print("\n"+"���ަ��Ǭ�: ");
		
		for(int i = 0 ; i<n ; i++) 
		{
			System.out.print((int)num[i]+" ");
		}

	}
}

