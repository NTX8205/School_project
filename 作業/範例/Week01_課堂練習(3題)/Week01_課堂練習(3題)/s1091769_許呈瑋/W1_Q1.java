//�P�_�O�_�����
//��ޤGB 410917693 �\�e޳
//2022/02/23
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList a = new ArrayList();
		for(int i = 1 ; i <= n ; i++) {
			if(n%i == 0) {
				 a.add(i);
			}
		}
		if(a.size()>2){
			System.out.println(n+"���O���");
		}else {
			System.out.println(n+"�O���");
		}
	}
}
