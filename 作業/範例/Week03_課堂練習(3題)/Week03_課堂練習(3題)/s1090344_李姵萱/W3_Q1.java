/*Q1: [p,q]�϶���ư��D*/
//��ޤGB 410903440 ���r��

import java.util.Arrays; //�i�H�ϥ�Array���Ѫ�sort��k
import java.util.Scanner;

public class W3_Q1 {
	public static void main(String args[]) 
	{
		
		try {
			System.out.println("�п�J�n���ͤ����Ʀr�Ӽ�:");
			Scanner scanner = new Scanner(System.in);
			int size = Integer.parseInt(scanner.nextLine());
			int n[] = new int[size];
       
			for (int i = 0; i < size; i++) 
			{
				n[i] = (int) (Math.random() * 10) + 1;
			}
      
			System.out.print("\n�Ƨǫe:" + Arrays.toString(n));
			Arrays.sort(n);
			System.out.print("\n�Ƨǫ�:" + Arrays.toString(n));
		
		} catch (Exception e) {
			System.out.println("��J���~");
		}

	}

}
