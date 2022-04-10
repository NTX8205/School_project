import java.util.*;
public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		System.out.print(a+"=");
		for(int i=2;;) {
			if(a%i==0) {
				count++;
			a/=i;
		}else {
			if(count>1) {
				System.out.print(i+"^"+count);
			}else if(count==1){
				System.out.print(i);
			}else if(count==0) {
				i++;
				continue;
			}
			 count=0;
			 i++;
			 if(a==1){
				 break;
			 }
			 System.out.print("*");
			}
		}
	}
}
//質因數分解進階版
//資管二B 410927973 袁孝鈞