//璸衡3タ俱计程そ计&程そ计
//戈恨A 410927907 独玜蝴
//Date: 2022/3/11
import java.util.*;
public class W3_Q3
{
	public static void main(String[] args) 
	{
		System.out.println("璸衡3タ俱计程そ计&程そ计:");
		System.out.print("叫块计:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int xy = get_gcd(x,y);
		int xyz = get_gcd(xy,z);
		
		
		System.out.println(x+","+y+","+z+"程そ计"+xyz);
		
		int lcmxy = x*y/xy; //x,y程そ计
		int gcdxyz = get_gcd(lcmxy,z);
		int lcmxyz = lcmxy*z/gcdxyz;
		
		System.out.print(x+","+y+","+z+"程そ计"+lcmxyz);
	}
	
    public static int get_gcd(int x, int y) {
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
