import java.util.*;

    class web {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int [] people = new int[n];
            int remain = n;
            int count = 0;
            
            while(remain>1) {
                for(int i=0; i<n; i++) {
                    if(people[i] != -1) {
                        count ++;
                        if(count ==3) {
                            count=0;
                            remain --;
                            people[i] = -1;
                        }
                    }
                }   
            }
    
        for(int i=0; i<n; i++) {
            if(people[i] != -1) {
                System.out.println(i+1);
            }
        }        
    }
}