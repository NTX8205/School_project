//�P�_�ϥΪ̿�J������ƬO�_�����
//��ޤGB 410917538 ��Ϊ�
//2022/02/23
import java.util.*;
public class W1_Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(n+"�O���");
		}else {
			System.out.print(n+"���O���");
		}
		//System.out.println(count);
	}

}

