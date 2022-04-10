import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//資管二A 410954344	黃振坤
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入一個整數:");
		int num=scanner.nextInt();
		System.out.print(num + "=");
		for(int k=2;k<=num;k++)
		{
			while (num!=k) 
			{
				if(num % k==0)
				{
					System.out.print(k+"*");
					num/=k;
				}
				else
				{
					break;
				}
			}
		}
		System.out.print(num);

	}

}
