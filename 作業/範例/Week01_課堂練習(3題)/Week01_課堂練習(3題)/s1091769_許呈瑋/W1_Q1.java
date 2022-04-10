//判斷是否為質數
//資管二B 410917693 許呈瑋
//2022/02/23
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList a = new ArrayList();
		for(int i = 1 ; i <= n ; i++) {
			if(n%i == 0) {
				 a.add(i);
			}
		}
		if(a.size()>2){
			System.out.println(n+"不是質數");
		}else {
			System.out.println(n+"是質數");
		}
	}
}
