//排序次序
//資管二A 410921862 郭孟玥
//Date：2022/03/10
import java.util.*;
public class W3_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("請輸入一個4 ~ 6 間的正整數");
		
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