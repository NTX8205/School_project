//�N�ϥΪ̿�J������i���]�Ƥ���
//��ޤGB 410917538 ��Ϊ�
//2022/02/23
import java.util.*;
public class W1_Q2{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i =2; 
        System.out.print(n + "=" ); 
        while(n>i){ 
            if(n%i==0){ 
                System.out.print(i+"*"); 
                n=n/i; 
            }else{ 
                i++; 
            } 
        } 
        System.out.print(n); 
	}

}

