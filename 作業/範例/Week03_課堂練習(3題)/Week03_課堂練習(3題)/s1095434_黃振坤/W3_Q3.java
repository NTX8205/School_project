//Q3�p��3�ӥ���ƪ��̤j���]��&�̤p������
//��ޤGA/410954344/�����[
//Date0315
import java.util.Scanner;
public class W3_Q3 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.println("�p��3�ӥ���ƪ��̤j���]��&�̤p������");


        System.out.println("�п�J�T�ӥ����:");

        Scanner i = new Scanner(System.in);


        int x = i.nextInt();

        int y = i.nextInt();

        int z = i.nextInt();

        int A0 = get_gcd(x, y); //A0����1,2�ӳ̤j���]��

        int A1 =get_gcd(z,A0);//�Ϋe��Ӽƪ��̤j���]�ƩM�ĤT�ӼơA�D�L�̤T�Ӫ��̤j���]��

        if(A1 == 1) { 

            System.out.println(x+","+y+","+z+"�S���̤j���]��");//�p�G�D�X�Ӫ��l�Ƭ�1�A�N��o�T�ӼƨS���̤j���]�ơC
        }else {

            System.out.println(x+","+y+","+z+"���̤j���]�Ƭ�"+A1);//�p�G�l�Ƥ���1�A�h��X�̤j������
        }



        int B0 = get_lcm(x, y,A0); //B0���e��ƪ��̤p������

        int B1 = get_gcd(B0, z); //�D�XB0�P�ĤT�ƪ��̤j���]��

        int B2 = get_lcm(B0, z,B1); //�̫�D�X�T�̪��̤p������

        System.out.println(x+","+y+","+z+"���̤p�����Ƭ�"+B2);



        



    }

    private static int get_gcd(int x, int y) {
        // TODO �۰ʲ��ͪ���k Stub
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
