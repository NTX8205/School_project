package W1;
//��ޤG�� �кͫ� 410918089
import java.util.*;
class prime{
	int m ;
	int n;
	int x=0;
	int judge(int i){
		for(m=2;m<i;m++){
			n = i % m;//�ݾl��
			if(n == 0){//�Y�l�Ƭ��s�A�h�����
				x++;
				return x;//�^�ǭ�1���D�{��
			}
		}
		return x;//�]��for�j��]���S���l�Ƭ��s���A�G����ơA�ҥH�^�ǭ�0���D�{��
	}
}
public class W1_Q1 {
	public static void main(String[] args) {
		int i,a,b=1;
		while(b>0){
		   Scanner scanner = new Scanner(System.in);
		   i = scanner.nextInt();
		   prime p = new prime();
		   a=p.judge(i);//�ݦ^�ǭȧP�_�O�_�����
		   if(a>0)
		   System.out.println("���O���");
		   else
		   System.out.println("�O���");
		  }

	}

}
