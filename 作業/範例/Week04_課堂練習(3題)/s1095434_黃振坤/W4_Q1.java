import java.util.Scanner;
public class W4_Q1 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.println("��n�ӤH�򦨤@��A���ǱƸ��]�q1���s��n ���^�C�q�Ĥ@�ӤH�}�l���ơ]�q1��3���ơ^�A�Z����3���H�X���h�X��l�A�ݳ̫�d�U���O�ĴX��");
		 System.out.println("��J�H��n,n>=5");
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int [] people=new int [n];
		 int remain =n; //���۪�
		 int count=0;  //����
		 int out =-1;  //�X��
		 
		 while(remain>1)
		 {
			 for(int i=0;i<people.length;i++)
			 {
				 if(people[i]!=out)
				 {
					 count++;
					 if(count==3)
					 {
						 count=0;
						 remain--;
						 people[i]=out;
					 }
				 }
			 }
		 }
		 for(int i=0;i<people.length;i++)
		 {
			 if(people[i]!=out)
			 {
				 System.out.println("�d�U�Ӫ��O:"+(i+1)+"��");
			 }
		 }
	}

}
