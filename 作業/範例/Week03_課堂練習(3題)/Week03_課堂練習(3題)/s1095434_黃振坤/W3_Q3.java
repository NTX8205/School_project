//Q3璸衡3タ俱计程そ计&程そ计
//戈恨A/410954344/独
//Date0315
import java.util.Scanner;
public class W3_Q3 {

	public static void main(String[] args) {
		// TODO 笆玻ネよ猭 Stub
		System.out.println("璸衡3タ俱计程そ计&程そ计");


        System.out.println("叫块タ俱计:");

        Scanner i = new Scanner(System.in);


        int x = i.nextInt();

        int y = i.nextInt();

        int z = i.nextInt();

        int A0 = get_gcd(x, y); //A0材1,2程そ计

        int A1 =get_gcd(z,A0);//ノ玡ㄢ计程そ计㎝材计―程そ计

        if(A1 == 1) { 

            System.out.println(x+","+y+","+z+"⊿Τ程そ计");//狦―ㄓ緇计1硂计⊿Τ程そ计
        }else {

            System.out.println(x+","+y+","+z+"程そ计"+A1);//狦緇计ぃ1玥块程そ计
        }



        int B0 = get_lcm(x, y,A0); //B0玡ㄢ计程そ计

        int B1 = get_gcd(B0, z); //―B0籔材计程そ计

        int B2 = get_lcm(B0, z,B1); //程―程そ计

        System.out.println(x+","+y+","+z+"程そ计"+B2);



        



    }

    private static int get_gcd(int x, int y) {
        // TODO 笆玻ネよ猭 Stub
         int tmp= 0;

        //―程そ计
            while( x%y != 0){
                tmp =y;
                y =x%y;
                x = tmp;
            }

            return y;
    }

      public static int get_lcm(int x,int y,int gnd)
            {
        //―程そ计


            return x/gnd*y;
    }

	
}
