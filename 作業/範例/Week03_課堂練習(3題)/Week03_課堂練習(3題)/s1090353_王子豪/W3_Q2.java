//Q2:�p��2�ӥ���ƪ��̤j���]��&�̤p������
//�Z��:���2A �Ǹ�:410903539 �m�W:���l��
//2022/3/15
package hw2222;
import java.util.*;
public class W3_Q2
{
	static void hw(int v,ArrayList<Integer>z)
    	{
        for(int i=2;i<=v;i++)
        {
            while(v!=i)
            {
                if(v%i==0)
                {
                    z.add(i);
                    v /= i;
                }
                else
                {
                    break;
                }
            }
        }
        z.add(v);
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt(); 
        int n = sc.nextInt();
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        hw(m,c);
        hw(n,d);
        System.out.println(c);
        System.out.println(d);
        int gcd=1;
        int lcm=1;
        for(int i=0;i<c.size();i++) 
        {
            for(int j=0;j<d.size();j++) 
            {
                if(c.get(i)==d.get(j)) 
                {
                    gcd*=c.get(i);
                    c.remove(i);
                    d.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        System.out.printf("%d�P%d���̤j���]�Ƭ�%d%n",m,n,gcd);
        lcm=gcd;
        for(int q:c) 
        {
            lcm*=q;
        }
        for(int p:d)
        {
            lcm*=p;
        }
        System.out.printf("%d�P%d���̤p�����Ƭ�%d",m,n,lcm);
    }
}