//410917863  ¸êºÞ2B ¥Ûñ¯ºû
import java.util.*;
public class W3_Q1 {

	public W3_Q1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str =new String[3];
		str[0] = sc.next();
		str[1] = sc.next();
		str[2] = sc.next();
		Arrays.sort(str);  //°}¦C±Æ§Ç
		for(int i = 0; i < str.length; i++){
		System.out.println(str[i]);
		}
	}

}
