import java.util.*;
public class W1_Q2 {
	//��ޤGA 410917855 ���f��
	//�N�ϥΪ̿�J������i���]�Ƥ���
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		int a=io.nextInt();
		int b[]=new int [a];
		System.out.print("a=");
		for(int i=2;i<=a;i++) {
			while(a!=i) {
				if(a%i==0) {
					System.out.print(i+"*");
					a/=i;
				}
			else {
				break;
				}
			}
		}
		System.out.print(a);

	}

}
