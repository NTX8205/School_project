package W1;
//資管二Ｂ 田睿宥 410918089
import java.util.*;
class prime{
	int m ;
	int n;
	int x=0;
	int judge(int i){
		for(m=2;m<i;m++){
			n = i % m;//看餘數
			if(n == 0){//若餘數為零，則為質數
				x++;
				return x;//回傳值1給主程式
			}
		}
		return x;//因為for迴圈跑完沒有餘數為零的，故為質數，所以回傳值0給主程式
	}
}
public class W1_Q1 {
	public static void main(String[] args) {
		int i,a,b=1;
		while(b>0){
		   Scanner scanner = new Scanner(System.in);
		   i = scanner.nextInt();
		   prime p = new prime();
		   a=p.judge(i);//看回傳值判斷是否為質數
		   if(a>0)
		   System.out.println("不是質數");
		   else
		   System.out.println("是質數");
		  }

	}

}
