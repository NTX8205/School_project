//題目：排序次序
//班級：資管二B 學號：410903521 姓名：葉宸甄
//日期：3/09
import java.util.*;
public class Q1 {
	public static int[] randomArray(int min,int max,int n){
		int len = max-min 1;
		if(max < min || n > len){
		return null;
		}
		int[] source = new int[len];
		for (int i = min; i < min len; i  ){
		source[i-min] = i;
		}
		int[] result = new int[n];
		Random rd = new Random();
		int index = 0;
		for (int i = 0; i < result.length; i ) {
		int s=rd.nextInt()%len;
		index = Math.abs(rd.nextInt()%len--);
		result[i] = source[index];
		source[index] = source[len];
		}
		return result;
		}
		public static void main(String[] args) {
		int[] reult2 = randomArray(0,4,5);
		for (int i : reult2) {
		System.out.print(i);
		}
	}
}
