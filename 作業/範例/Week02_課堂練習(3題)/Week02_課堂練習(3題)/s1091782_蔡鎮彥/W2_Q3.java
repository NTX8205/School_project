/*Q3: ��]�Ƥ��Ѷi���� 
  ��ޤGB 410917821 �����*/ 
import java.io.*;
import java.util.*;
public class Q3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0; //�_�l��0
		System.out.print(n+" = ");//�L�Xn���X�ӽ�]��
		for(int i=2;;) { //�]i=2�h��n
			if(n%i==0) {
				count++;
				n/=i;
			} else {
				if(count>1) {
					System.out.print(i+"^"+count);
				}else if(count==1) {
				
					System.out.print(i);
			
				}else if(count==0) {
					i++;
					continue;
				}
				count=0;
				i++;
				if(n==1) {
					break;
				} else {
					System.out.print("*");
				}
			}
		}
		
	}

}
