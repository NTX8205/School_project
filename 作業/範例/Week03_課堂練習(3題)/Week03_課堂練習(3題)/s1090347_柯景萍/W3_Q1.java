//�D�ػ���:�ƧǦ���
//��ޤGA 410903474 �_����
//Date:2022/03/15
package test;
import java.util.*;
public class W3_Q1 {
	public static void main(String[] args) {
		System.out.println("�п�Jn�ӼƦr�|�H������n�ӶýX");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=10){
			for(int i=1;i<=n;i++) {
				int k = (int)(Math.random()*100+1);
				System.out.print(k+" ");
			}
		}else {
			System.out.println("�п�J�p��10���Ʀr");
		}
		
		String str=new Scanner(System.in).nextLine();
		ArrayList<Number> list=new ArrayList<>();
		String[] srr=str.split(" ");
		
		System.out.println(" ");
		System.out.println("�on�Ӿ�Ʀb�Ƨǫ᪺���ަ��Ǭ�%d %d %d %d");
	}
}
