//Exra2:GCD&LCM(�T�ӥ����)�p��
//�Z��:���2A �Ǹ�:410918186 �m�W:�d���
//���:2022/2/23
import java.util.*;
public class extra2 
{
    public static void main(String args[]) 
    {
        Scanner scanner =new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int GCD=GCD(a,b);
            int GCD1=GCD(c,GCD);//�D�e��Ӽƪ�GCD�Mc��LCM
            if(GCD1==1) 
            {
                System.out.println(a+" "+b+" "+c+"�S���̤j���]��");
            }
            else 
            {
                System.out.println(a+" "+b+" "+c+"���̤j���]�Ƭ�"+GCD1);
            }   
            int LCM=LCM(a,b,GCD);//���Da�Mb��LCM
            int GCD2=GCD(LCM,c);//�A�DLCM�Mc���̤j���]��
            int LCM1=LCM(LCM,c,GCD2);//�̫�DLCM�Mc���̤p������
            System.out.println(a+" "+b+" "+c+"���̤p�����Ƭ�"+LCM1);
        }   


    public static int GCD(int a,int b) 
    {
    	int temp =0;
    	temp=a%b;
    	while(temp!=0) 
    	{
    		a=b;
    		b=temp;
    		temp=a%b;
    	}
    	return b;
     
    }
    //�D�̤p������,�N�T�Ӽư��H�L�̪��̤j���]�ơA�M��ۭ��A�A���H�̤j���]��
    public static int LCM(int a,int b,int GCD) 
    {
        return a/GCD*b;
    }
}