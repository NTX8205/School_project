//�D�ػ���:��]�Ƥ���
//410917651 ���2B ���C��
//Date:2022/3/1
import java.util.*;
public class W1_Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        System.out.print(z + "=");
        for (int  x= 2; x <= z; x++) {
            while (z != x) {
                if (z % x == 0) {
                    System.out.print(x + "*");
                    z /= x;
                	} else {
                    break;
                	}
            	}
        	}
        	System.out.print(z);
        	}
		}
