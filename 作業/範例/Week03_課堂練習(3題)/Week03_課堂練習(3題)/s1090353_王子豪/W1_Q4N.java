// �p���ӥ���ƪ��̤j���]��&�̤p������ �D���j�B�z(�@�Ӱj��)
// ��ޤGA 410903539 ���l��
// 2022/2/23
package hw;
import java.util.*; 
public class extra 
{  
	public static void main(String args[])
	{
		int x;
		int y;
		Scanner sc = new Scanner(System.in); 
		System.out.println("�п�J��ӥ����:"); 
		x = sc.nextInt(); 
		y = sc.nextInt(); 
		int total;
		int r; 
		total=x*y; 
			do
			{ 
				if(x<y)
				{ 
					int t=x; 
					x=y; 
					y=t; 
				}
			r=x%y; 
			x=y; 
			y=r; 
			}
		while(r!=0); 
		System.out.println("�̤j���]�ƬO�G"+x); 
		System.out.println("�̤p�����ƬO�G"+total/x); 
	} 
}