//�ϥΪ̿�J��ӥ����p,q,��X����p��q�������Ҧ���ƻP����`��
//��ޤGA 410927907 ���a��
//Date:2022/03/03

import java.util.Scanner;
public class W2_Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int sum = 0;

        if(p>q){
            int temp;
            temp = p;
            p = q ;
            q = temp;
        }

        for(int i = p ; i<=q ; i++){ //p��q
            if(i == 1)
                i++;
            int count = 0;
            for(int j = 2 ; j < i ;j++){ //�P�_i�O�_�����
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 0) {
                System.out.print(i+ " ");
                sum++;
            }
        }
        System.out.println();
        System.out.print("����`��: "+sum);

    }

}