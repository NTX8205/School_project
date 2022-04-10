/*
肈ヘ: 璸衡ㄢタ俱计程そ计&程そ计(患癹)
痁:戈恨A ﹎:独踌 厩腹:410903416
 */

import java.util.*;
public class W1_Q3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();   
    int x = a;
    int y = b;
    int z;
    while( x%y != 0 ){
    	z = y;
    	y = x%y;
    	x = z;
        }
        
        System.out.println(a+"籔"+b+"程そ计:"+y);
        System.out.println(a+"籔"+b+"程そ计:"+a*b/y);

    }
}
