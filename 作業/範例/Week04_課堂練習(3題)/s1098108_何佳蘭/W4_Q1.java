package 資料結構第四次作業;
/*利用陣列來解決給定的問題
Q1: 三號出局
410981082
資管二B
何佳蘭
*/
import java.util.*;
public class W4_Q1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=1;i<=a;i++) {
			list.add(i);
		}
		while(list.size() !=1) {
			list.add(list.remove(0));
			list.remove(0);
		}
		System.out.println(list.get(0));
	}

}
