import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ޤGA 410954344	�����[
		System.out.println("�p���Ӿ�ƪ��̤j���]�ƻP�̤p������");
        System.out.println("�п�J��Ӿ��:");

        Scanner i = new Scanner(System.in);

        int x = i.nextInt();

        int y = i.nextInt();

        System.out.printf(x+"�M"+y+"���̤j���]�Ƭ�"+get_gcd(x, y)+"\n");

        System.out.printf(x+"�M"+y+"���̤p�����Ƭ�"+get_lcm(x, y));
        
        
        
        
        
    }

    private static int get_gcd(int x, int y) {
        // TODO �۰ʲ��ͪ���k Stub
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


