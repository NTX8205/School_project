//Q1:�T���X��(��n�ӤH�򦨤@��A���ǱƸ��]�q1���s��n ���^�C�q�Ĥ@�ӤH�}�l���ơ]�q1��3���ơ^�A�Z����3���H�X���h�X��l�A�ݳ̫�d�U���O�ĴX���C)
//��ޤGb 410917863 ����
//Date:2022/3/18
import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
		System.out.println("��n�ӤH�򦨤@��A���ǱƸ��]�q1���s��n ���^�C�q�Ĥ@�ӤH�}�l���ơ]�q1��3���ơ^�A�Z����3���H�X���h�X��l�A�ݳ̫�d�U���O�ĴX��");
		System.out.print("��J�H��n�An >= 5: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int people[] =new int[n];
		int remain = n ; //�s��
		int count = 0 ; //����
		int out = 87; //�X��
		
		while(remain > 1) 
		{
			for(int i = 0 ; i<people.length ; i++) 
			{
				if(people[i] != out) 
				{
					count++;
					if(count == 3) 
					{
						count = 0;
						remain--;
						people[i] = out;
					}
				}
			}
		}
		
		for(int i = 0 ; i<people.length ; i++) 
		{
			if(people[i] != out) 
			{
				System.out.println("�̫�@�ӥ��X���̪��s��: " + (i+1)  );
			}
		}
	}
}
