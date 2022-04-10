package java資結;
/*計算兩個正整數的最大公因數&最小公倍數
 * 410981082
 * 資管二B
 * 何佳蘭
 * 2022/02/24 22:35
 */
import java.util.Scanner;
public class W3_Q3 {

	public static void main(String[] args) {
		System.out.println("計算兩個整數的最大公因數與最小公倍數");
        System.out.println("請輸入兩個整數:");

        Scanner i = new Scanner(System.in);

        int x = i.nextInt();

        int y = i.nextInt();

        System.out.printf(x+"和"+y+"的最大公因數為"+get_gcd(x, y)+"\n");

        System.out.printf(x+"和"+y+"的最小公倍數為"+get_lcm(x, y));
        
        
        
        
        
    }

    private static int get_gcd(int x, int y) {

         int tmp= 0;


            while( x%y != 0){
                tmp =y;
                y =x%y;
                x = tmp;
            }

            return y;
    }

      public static int get_lcm(int x,int y)
            {
            int lcm=0;

            lcm = x*y/get_gcd(x, y);

            return lcm;

	}

}
