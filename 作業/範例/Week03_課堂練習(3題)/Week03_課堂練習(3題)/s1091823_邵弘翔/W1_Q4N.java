//Q4: �p���ӥ���ƪ��̤j���]��&�̤p������
//�Z��:��ޤGB
//�Ǹ�:410918233
//�m�W:�򥰵�
import java.util.Scanner;
public class W1_Q4N
 {
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        //�ϥΪ̿�J��ӥ����
        System.out.println("�п�J��ӥ����");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = 2;
		int gcd = 1;
		int lcm = 1;
		int a = n;
		int b = m;
		while(n!=1 || m!=1) 
        {
			if(n%i==0 && m%i==0) 
            {
				gcd*=i;
				lcm*=i;
				n/=i;
				m/=i;
			 }
             else if(n%i==0) 
             {
				lcm*=i;
				n/=i;
			 }
             else if(m%i==0)
             {
				lcm*=i;
				m/=i;
			}
            else {
				i++;
			}
		}
		System.out.println(a+"�P"+b+"���̤j���]�Ƭ�"+gcd);
		System.out.println(a+"�P"+b+"���̤p�����Ƭ�"+lcm);
	}
	
}
