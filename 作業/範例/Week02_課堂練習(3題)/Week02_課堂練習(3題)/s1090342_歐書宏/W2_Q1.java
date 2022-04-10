//題目說明:找質數區間
//資管二B 410903424 歐書宏
//Date:2022/3/8
import java.util.ArrayList;
import java.util.List;
public class homework {
 
	public static void main(String[] args) {
		int loop=0;
		List<Integer> lists = new ArrayList<Integer>();
		int i=0;
		int j=0;
		for (i = 101; i < 200; i++) {
			for ( j = 2; j < i; j++) {
				if(i%j == 0){
					break;
				}
			}
			if(j >= i){
				lists.add(i);
				loop++;
			}
		}
		System.out.print(loop + "個奇數" + "分別為：");
		for( i=0; i < lists.size(); i++){
			System.out.print(lists.get(i)+", ");
		}
 
	}
 
}