// Q1: �ƧǦ���
// 410918306 ��ޤGA ���Y��
// ��� 2022/3/14

package DataStructure;
import java.util.*;
public class W3_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�@�� 4 ~ 6 ���������");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] index = arr;
		int min = 1;
		if(n>=4 && n<=6) {
			for(int i=0;i<arr.length;i++) {
				arr[i] = (int)(Math.random()*100)+1;
				System.out.printf(arr[i]+" ");
			}
			System.out.println();
			
			for(int i=0;i<100;i++) {
				for(int j=0;j<n;j++) {
					if(arr[j]==i) {
						index[j] = min;
						for(int k=0;k<n;k++) {
							if(arr[k] == i) {
								index[k] = min;
							}
						}
						min++;
					}
				}
			}
			
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}else {
			System.out.println("��J���~");
		}	
	}
}
