package hw;
import java.util.*;
public class plus2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<3;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int max=0,min=0;
		for(int i=1;i<=a[0];i++) {
			if(a[0]%i==0&&a[1]%i==0&&a[2]%i==0)
				max=i;
		}
		for(int i=a[2];i<=a[0]*a[1]*a[2];i++) {
			if(i%a[0]==0&&i%a[1]==0&&i%a[2]==0) {
				min=i;
				break;
			}
		}
		System.out.println("x="+a[0]+",y="+a[1]+",z="+a[2]+" xyz程そ计"+max+"\n"+"x="+a[0]+",y="+a[1]+",z="+a[2]+" xyz程そ计"+min);
		
		
	}

}
