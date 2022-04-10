//Exra2:GCD&LCM(タ俱计)璸衡
//痁:戈恨2A 厩腹:410918186 ﹎:ヲ
//ら戳:2022/2/23
import java.util.*;
public class extra2 
{
    public static void main(String args[]) 
    {
        Scanner scanner =new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int GCD=GCD(a,b);
            int GCD1=GCD(c,GCD);//―玡ㄢ计GCD㎝cLCM
            if(GCD1==1) 
            {
                System.out.println(a+" "+b+" "+c+"⊿Τ程そ计");
            }
            else 
            {
                System.out.println(a+" "+b+" "+c+"程そ计"+GCD1);
            }   
            int LCM=LCM(a,b,GCD);//―a㎝bLCM
            int GCD2=GCD(LCM,c);//―LCM㎝c程そ计
            int LCM1=LCM(LCM,c,GCD2);//程―LCM㎝c程そ计
            System.out.println(a+" "+b+" "+c+"程そ计"+LCM1);
        }   


    public static int GCD(int a,int b) 
    {
    	int temp =0;
    	temp=a%b;
    	while(temp!=0) 
    	{
    		a=b;
    		b=temp;
    		temp=a%b;
    	}
    	return b;
     
    }
    //―程そ计,盢计埃程そ计礛程そ计
    public static int LCM(int a,int b,int GCD) 
    {
        return a/GCD*b;
    }
}