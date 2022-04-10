package 資料結構第三次作業;
/*Q3: 計算3個正整數的最大公因數(gcd)&最小公倍數(lcm)
 * 410981082
 * 資管二B
 * 何佳蘭
 */
import java.util.Scanner;
public class W3_Q3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.println("計算3個正整數的最大公因數&最小公倍數");


        System.out.println("請輸入三個正整數:");

        Scanner i = new Scanner(System.in);


        int x = i.nextInt();

        int y = i.nextInt();

        int z = i.nextInt();

        int A0 = get_gcd(x, y); //A0為第1,2個最大公因數

        int A1 =get_gcd(z,A0);//用前兩個數的最大公因數和第三個數，求他們三個的最大公因數

        if(A1 == 1) { 

            System.out.println(x+","+y+","+z+"沒有最大公因數");//如果求出來的餘數為1，代表這三個數沒有最大公因數。
        }else {

            System.out.println(x+","+y+","+z+"的最大公因數為"+A1);//如果餘數不為1，則輸出最大公約數
        }



        int B0 = get_lcm(x, y,A0); //B0為前兩數的最小公倍數

        int B1 = get_gcd(B0, z); //求出B0與第三數的最大公因數

        int B2 = get_lcm(B0, z,B1); //最後求出三者的最小公倍數

        System.out.println(x+","+y+","+z+"的最小公倍數為"+B2);



        



    }

    private static int get_gcd(int x, int y) {
        // TODO 自動產生的方法 Stub
         int tmp= 0;

        //求最大的公因數
            while( x%y != 0){
                tmp =y;
                y =x%y;
                x = tmp;
            }

            return y;
    }

      public static int get_lcm(int x,int y,int gnd)
            {
        //求最小的公倍數


            return x/gnd*y;
    }

	
}
