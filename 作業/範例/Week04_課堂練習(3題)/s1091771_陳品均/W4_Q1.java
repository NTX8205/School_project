//Q1: 三號出局
// 410917716 資管二A 陳品均
// 日期 2022/3/14
package hw;
import java.util.*;
public class W4_Q1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=a;i++) {
			list.add(i);
		}
		while(list.size()!=1) {
			list.add(list.remove(0));
			list.add(list.remove(0));
			list.remove(0);
		}
		System.out.println(list.get(0));
	}
}
