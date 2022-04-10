//題目說明:判斷是否為質數
//410917651 資管2B 陳嵩互
//Date:2022/2/23
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int count = 0 ;
    for(int i = 2 ; i < a; i++){
    	if(a%i==0){
     		System.out.println(a+"不是質數");
     		break;
            }else{
            System.out.println(a+"是質數");
            break;
      }
    }
  }
}


