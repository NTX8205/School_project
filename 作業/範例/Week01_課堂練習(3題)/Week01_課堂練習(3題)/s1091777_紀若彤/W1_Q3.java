//�p���ӥ���ƪ��̤j���]��&�̤p������
//��ޤGA 410917774 ���Y��
//2022/02/24
import java.util.*;
public class W1_Q3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
       
        
        System.out.println(a + "�P" + b + "���̤j���]�Ƭ�:" + gcd(a,b));
        
        System.out.println(a + "�P" + b + "���̤p�����Ƭ�:" + a*b/gcd(a,b));
    }
    static int gcd(int a,int b){
        if(a%b==0){
            return b;
            }else{
                return gcd(b,a%b);
            }
        }
}