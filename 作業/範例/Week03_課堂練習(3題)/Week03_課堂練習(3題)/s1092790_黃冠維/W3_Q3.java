//�p��3�ӥ���ƪ��̤j���]��&�̤p������
//��ޤGA 410927907 ���a��
//Date: 2022/3/11
import java.util.*;
public class W3_Q3
{
	public static void main(String[] args) 
	{
		System.out.println("�p��3�ӥ���ƪ��̤j���]��&�̤p������:");
		System.out.print("�п�J�T�Ӽ�:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int xy = get_gcd(x,y);
		int xyz = get_gcd(xy,z);
		
		
		System.out.println(x+","+y+","+z+"���̤j���]�Ƭ�"+xyz);
		
		int lcmxy = x*y/xy; //x,y���̤p������
		int gcdxyz = get_gcd(lcmxy,z);
		int lcmxyz = lcmxy*z/gcdxyz;
		
		System.out.print(x+","+y+","+z+"���̤p�����Ƭ�"+lcmxyz);
	}
	
    public static int get_gcd(int x, int y) {
         int tmp= 0;

        //�D�̤j�����]��
            while( x%y != 0){
                tmp =y;
                y =x%y;
                x = tmp;
            }
            return y;
    }
    
    public static int get_lcm(int x,int y,int gnd)
    {
    	//�D�̤p��������
    	return x/gnd*y;
    }
}
