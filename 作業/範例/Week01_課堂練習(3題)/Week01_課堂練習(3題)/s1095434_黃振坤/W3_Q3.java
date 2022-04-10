import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//戈恨A 410954344	独
		System.out.println("璸衡ㄢ俱计程そ计籔程そ计");
        System.out.println("叫块ㄢ俱计:");

        Scanner i = new Scanner(System.in);

        int x = i.nextInt();

        int y = i.nextInt();

        System.out.printf(x+"㎝"+y+"程そ计"+get_gcd(x, y)+"\n");

        System.out.printf(x+"㎝"+y+"程そ计"+get_lcm(x, y));
        
        
        
        
        
    }

    private static int get_gcd(int x, int y) {
        // TODO 笆玻ネよ猭 Stub
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


