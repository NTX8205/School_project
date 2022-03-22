import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> test = new ArrayList<Integer>();
        
        int n=sc.nextInt();
        int count=n;

        for(int i=0;i<5;i++){
            test.add(i,i+1);
        }
        

        while(count!=1){
            if(count!=2){
                int tmp=(int)test.get(0);
                int tmp1=(int)test.get(1);
                

                for(int i=0;i<n-3;i++){
                    test.set(i, test.get(2+i));
                } 
            }
            else{
                test.remove(0);
            }
        }
        System.out.println();
    }
}