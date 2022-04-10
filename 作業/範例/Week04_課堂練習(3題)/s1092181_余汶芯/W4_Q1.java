import java.util.*;
//三號出局
//資管二B 410921812 余汶芯 
public class W4_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] people = new int[n];// 人數
		int remain = n;// 留下來的
		int count = 0;

		while (remain > 1) {
			for (int i = 0; i < n; i++) {
				if (people[i] != -1) {// 設-1為出局，若第某號不等於-1，則不需要出局
					count++;
					if (count == 3) {
						count = 0;// 歸零
						remain--;// 留下來的人數減少
						people[i] = -1;// 第某號出局
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (people[i] != -1) {
				System.out.println(i + 1);
			}
		}
	}
}