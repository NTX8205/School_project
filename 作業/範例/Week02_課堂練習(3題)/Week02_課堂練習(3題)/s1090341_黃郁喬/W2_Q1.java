/*
�D��:[p,q]�϶���ư��D
�Z��:��ޤGA �m�W:������ �Ǹ�:410903416
 */

import java.util.Scanner;
public class W2_Q1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int p = sc.nextInt();
			int q = sc.nextInt();
			int sum=0;
			int count=0;
				if(p>q) { //��ƧP�_����
					int tmp=p;
					p=q;
					q=tmp;
			}
				for(int i=p;i<q;i++) {
					count=0;
					for(int j=1;j<=i;j++) {
						if(i%j==0) {
							count++;
						}
					}
				if(count==2) {
					System.out.print(i+" ");
					sum++;
			}
		}
				System.out.println("\n��ƭӼ�"+sum);
		}
}

		
	