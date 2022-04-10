import java.util.*;
public class finalexam1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0;
		for(int i=0;i*10<=n;i++) {
			for(int j=0;j*5+i*10<=n;j++) {
				s++;
			}
		}
		System.out.println(s);
	}
}	