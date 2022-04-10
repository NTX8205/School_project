//題目說明:Q3: 質因數分解進階版
//班級:資管二B
//學號:410918233
//姓名:邵弘翔
import java.util.Scanner;
public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		System.out.print(n+"=");
		
		for(int i=2;;) {
			if(n%i==0) {
				count++;
				n/=i;
			}else {
				if(count>1) {
					System.out.print(i+"^"+count);
				}else if(count==1) {
					System.out.print(i);
				}else {
					i++;
					continue;
				}
				count=0;
				if(n==1) {
					break;
				}else{
				System.out.print("*");
				}
			}
		}
	}
}
