//
//Q2:�p��2�ӥ���ƪ��̤j���]��&�̤p������
//
//��ޤGB �F�E��  410927957
//Date:2022/03/14
import java.util.*;
public class W3_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(), i=2, gcd=1, lcm=1;
		int n=a,m=b;
		ArrayList<Integer> A = new ArrayList();
		ArrayList<Integer> B = new ArrayList();
		while(a != 1) {
			if(a%i==0) {
				A.add(i);
				a/=i;
			}else {
				i++;
			}
		}
		i=2;
		while(b != 1) {
			if(b%i==0) {
				B.add(i);
				b/=i;
			}else {
				i++;
			}
		}		
		for(int j=0;j<A.size();j++) {
			for(int k=0;k<B.size();k++) {
				if(A.get(j)==B.get(k)) {
					gcd*=A.get(j);
					A.set(j,1);;
					break;
				}
			}
		}
		lcm=n*m/gcd;	
		System.out.println(n+"�P"+m+"���̤j���]�Ƭ�"+gcd);
		System.out.println(n+"�P"+m+"���̤p�����Ƭ�"+lcm);
		
	}

}
