// 璸衡3タ俱计程そ计&程そ计
// 戈恨A 410903539 花
// 2022/2/23
package hw;
import java.util.*;
public class extra2 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("叫块タ俱计:");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int GCD = GCD(x,y);
            int GCD1 = GCD(z,GCD);
            if(GCD1==1) {
                System.out.println(x+" "+y+" "+z+"⊿Τ程そ计");
            }else{
                System.out.println(x+" "+y+" "+z+"程そ计"+GCD1);
            }   
            int LCM=LCM(x,y,GCD);
            int GCD2=GCD(LCM,z);
            int LCM1=LCM(LCM,z,GCD2);
            System.out.println(x+" "+y+" "+z+"程そ计"+LCM1);
        }   
    }
    public static int GCD(int x,int y){
    PX(x,y);
    int num=0;
    for(int i=y;i>0;i--) {
        if(x%i==0&&y%i==0) {
            num=i;
            break;
        }
    }
    return num;     
}
public static int LCM(int x,int y,int GCD) {
    return x/GCD*y;
}
public static void PX(int x,int y) {
    int a;
    if(x<y) {
        a=x;
        x=y;
        y=a;
    }
}

}