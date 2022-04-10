// Q1: 排序次序
// 410917716 資管二A 陳品均
// 日期 2022/3/14
package hw;
import java.util.*;
public class W3_Q1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Random rand = new Random();
		int[] arr=new int[n];
		int[] index = arr;
		int min=1;
		for(int i=0;i<n;i++) {
			arr[i]= rand.nextInt(100);
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<100;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j]==i) {
					index[j]=min;
					for(int k=0;k<n;k++) {
						if(arr[k]==i) {
							index[k]=min;
						}
					}
					min++;
				}
		
			}
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(+arr[i]+" ");
		}
	}
}
