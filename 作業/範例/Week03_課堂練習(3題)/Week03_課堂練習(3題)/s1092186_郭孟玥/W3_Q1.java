//�ƧǦ���
//��ޤGA 410921862 ���s��
//Date�G2022/03/10
import java.util.*;
public class W3_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("�п�J�@��4 ~ 6 ���������");
		
		int n=sc.nextInt();
		int [] Array = new int [n] ;
		int [] index = Array;
		int min = 1;
		
		for(int z=0;z<Array.length;z++) {
			Array[z] = (int)(Math.random()*100)+1;
			System.out.printf(Array[z]+" ");
		}
		
		
		System.out.println();
		
			for(int i=0;i<100;i++) {
				for(int j=0;j<n;j++){
					if(Array[j]==i) {
						index[j] = min;
						for(int k=0;k<n;k++) {
							if(Array[k]==i) {
								index[k]=min;
							}
						}
						min++;
					}
				}
				
			}
			
			for(int i=0;i<n;i++) {   
				System.out.print(Array[i]+"  ");
			}
	}
}