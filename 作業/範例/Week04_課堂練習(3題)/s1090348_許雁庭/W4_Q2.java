import java.util.Scanner;

public class W4_Q2 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(); //��J���`�H�� 5
	int [] arr=new int [n]; //�إߤ@�ӻP�`�H�ƬۦP��m��ƪ��}�C
	
	for(int i=0;i<n;i++) { //�N�C�ӤH�Ƥ��O��J�}�C��
		arr[i]=i+1; // 1|2|3|4|5(�}�C���C���x�s���Ʀr)
	}
	int j=0; //�Ψӭp��]�Fn����A�n���]�@��
	int a=1; //�Ψӭp���`�@�]�L�������Ħ���
	while(a<=3*(n-1)) { //�`�@���Ƶ���3*(n-1),�̿�J��n���P�Ӧ��t��
		
			int b=a%3; //�˹��`���ƬO�_�]���"3������"
			if(b==0) { //���`���ƶ]���"3������"�ɡA�N�n�N���ݨ쪺�Ӯ�}�C�����Ʀr���s
				arr[j]=0;
			}
			j++; //���]����+1
			
			if(j>=n) { //���Q���ƨ�Fn���ɡA���s�p��C
				j=0;
			}
			
			if(arr[j]!=0) { //��ƨ쪺�Ӯ�}�C�����Ʀr>0�A��ܬ����Ħ��ơA�ҥH�p���`���ƪ�a++�A�_�h��+1
				a++;
			}
			
		
	}
	
	//�إߤ@�Ӿ�ƥΨӦs�񵪮�
	for(int i=0;i<n;i++) { //�ˬd�Ҧ��}�C�����Ӱ}�C���Ʀr>0
		if(arr[i]>0) {
			System.out.println(arr[i]); //�s�Jans
		}
	}
}
}
	
	/*int ans=0; //�إߤ@�Ӿ�ƥΨӦs�񵪮�
	for(int i=0;i<n;i++) { //�ˬd�Ҧ��}�C�����Ӱ}�C���Ʀr>0
		if(arr[i]>0) {
			ans=arr[i]; //�s�Jans
		}
	}
	System.out.println(ans); //��Xans
	
}*/

