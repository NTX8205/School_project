/*��ޤGB 410917538 ��Ϊ�
 * Q1 [p,q]�϶���ư��D
 2022/03/04
 */
import java.util.*;
public class W2_Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		if(p>q) {
			int tmp=p;
			p=q;
			q=tmp;
		}
		for(int i=p+1;i<q;i++) {
			boolean z=true;
			for(int j=i-1;j>1;j--) {
				if(i%j==0) {
					z=false;
				}
			}
			if(z) {
				System.out.println(i+" ");
				count++;
			}
		}
		System.out.println("��ƭӼ�: "+count);

	}

}
