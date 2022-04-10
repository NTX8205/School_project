//Q1:排序次序使用者輸入一個正整數n, 其中n<=10. 利用亂數隨機產生n個介於1~100的正整數並儲存到一維陣列中+
//班級:資管二B /學號:410917481/姓名:黃柏翔
import java.util.*;
public class W3_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int[] num = new int[n];
		int[] num2 = new int[n];
		for(int i = 0 ; i<num.length ; i++ ) { //原本
			num[i] = (int)(Math.random()*100);
			num2[i] = num[i];
		}
		System.out.print("原本的:");
		for(int i=0 ; i<num.length ; i++) {
			System.out.printf("%d ",num[i]);
		}
		Arrays.sort(num2);
		System.out.print("\n排好的:");
		for(int i=0 ; i<num.length ; i++) { //排好的
			System.out.printf("%d ",num2[i]);
		}
		System.out.print("\n答案:");
		for(int i = 0;i<num.length;i++) {
			for(int j = 0;j<num.length;j++) {
				if(num[i]==num2[j]) {
					System.out.printf("%d ",j+1);
				}
			}
		}					
	}
}

