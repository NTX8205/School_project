//Q1:[p,q]區間質數
//
//系級:資管二A
//學號:410928042
//姓名:王若雯
import java.util.*;
public class W2_Q1 {
	public static void main (String args[]) {
		Scanner sc = new  Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int temp;
		int count=0;
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		
		for (int i = num1; i <= num2; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {//不懂，只需判斷num1 的平方根，減少迴圈次數
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (i!=1 && flag) {
				System.out.printf("%d ",i);
				count++;
			}
		}
		System.out.printf("%n%d到%d有%d個質數",num1,num2,count);
	}
}