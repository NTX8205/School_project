//三號出局
//410654114 資工5B李明熹
//2022/3/18
import java.util.Scanner;

public class W4_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] people = new int[input];
		int remain = input; 
		int count = 0; 
		int out = -1;
		while (remain > 1) {
			for (int i = 0; i < input; i++) {
				if (people[i] != out) {
					count++;
					if (count == 3) {
						count = 0;
						remain--;
						people[i] = out;
						
					}
				}
			}
		}
		for (int i = 0; i < input; i++) {
			if (people[i] != out) {
				System.out.println(i+1);
			}
		}
	}

}
