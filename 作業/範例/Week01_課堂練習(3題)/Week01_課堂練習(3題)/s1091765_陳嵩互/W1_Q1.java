//�D�ػ���:�P�_�O�_�����
//410917651 ���2B ���C��
//Date:2022/2/23
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int count = 0 ;
    for(int i = 2 ; i < a; i++){
    	if(a%i==0){
     		System.out.println(a+"���O���");
     		break;
            }else{
            System.out.println(a+"�O���");
            break;
      }
    }
  }
}


