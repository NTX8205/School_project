//Q1.排序次序
//資管二B 梁實翔 410917504
//Date:2022/03/15
import java.util.*;
import java.io.*;
public class W3_Q1 {

	public W3_Q1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = (int)(Math.random()*100);
			arr2[i] = arr[i];
		}
		System.out.print("Original array: ");
		for(int i = 0;i<arr.length;i++) {
			System.out.printf("%d ", arr[i]);
		}
		Arrays.sort(arr2);
		System.out.print("\nSorted array: ");
		for(int i = 0;i<arr2.length;i++) {
			System.out.printf("%d ", arr2[i]);
		}
		System.out.print("\nIndex of array: ");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr2.length;j++) {
				if(arr[i] == arr2[j]) {
					System.out.printf("%d ", j+1);
				}
			}
		}
	}

}
