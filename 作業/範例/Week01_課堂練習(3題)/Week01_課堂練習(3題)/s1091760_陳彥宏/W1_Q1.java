// 410917601 ��ޤGA ���ۧ�
import java.util.*;
public class Main {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int b = 0;
	for(int i=1;i<=n;i++) {
		
		if(n%i==0) {
			System.out.println(i);
			b=b+1;
		}
}
		if(b==2) {System.out.println(n+"�O���");}
		else {System.out.println(n+"���O���");}
		}
}



