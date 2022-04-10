//
//Q2: 最接近質數問題
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W2_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個數:");
		
		int a = sc.nextInt();
		int count = 0;
		int tis1 = 0;
		int tis2 = 0;
		int add = 0;
		int sub = 0;
		
		if(a<=1) {
			System.out.println("輸入錯誤!!!");
		}else if(a==2) {
			System.out.printf("最接近2的質數:3");
		}else {
			for(int x=a+1;;x++) {				
				tis1++;
				count=0;
				
				for(int j=2;j<=x;j++) {	
					if(x%j==0) {
						count++;
					}
				}
				
				if(count!=1) {
					continue;
				}else {
					add=x;
					break;
				}
			}

			for(int y=a-1;;y--) {
				
				tis2++;
				count=0;
				
				for(int j=2;j<=y;j++) {	
					if(y%j==0) {
						count++;
					}
				}
				
				if(count!=1) {
					continue;
				}else {
					sub=y;
					break;
				}
			}
			
			if(tis1<tis2) {
				System.out.printf("最接近%d的質數:%d",a,add);
			}else if(tis1>tis2) {
				System.out.printf("最接近%d的質數:%d",a,sub);
			}else {
				System.out.printf("最接近%d的質數:%d %d",a,sub,add);
			}
		}
	}
}

