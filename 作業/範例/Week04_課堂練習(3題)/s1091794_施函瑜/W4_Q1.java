//Q1: 三號出局
//班級:資管2A 學號:410917944 姓名:施函瑜
//日期:2022/3/20
import java.util.*;
public class W4_Q1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int cnt =0;
		int arr[] =new int[n];
		int num =0;
		int ans = 0;
		for(int j =0;j<arr.length;j++) {
			arr[j] = 1;
		}
		while(num != 1) {
			num = 0 ;
			for(int i =0;i<arr.length;i++) {
				if(arr[i] != 0) {
					cnt++;
					ans = i;
				}
				if(cnt % 3 == 0) {
					arr[i] = 0;
				}
				if(arr[i] != 0) {
					num ++;
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] +" ");
			}
		}
		System.out.print(ans+1);
	}

}
