// Q3: 璸衡3タ俱计程そ计(gcd)&程そ计(lcm)
// 410917716 戈恨A 朝珇А
// ら戳 2022/3/14
package hw;
import java.util.*;
public class W3_Q3 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
	    int a[] = new int[3];
	    ArrayList<Integer> arr = new ArrayList();
	    ArrayList<Integer> arr1 = new ArrayList();
	    ArrayList<Integer> arr2 = new ArrayList(); 
	    for(int i=0; i<3; i++) {
	    	a[i] = sc.nextInt();
	    }
	    Arrays.sort(a);
	    for(int i=1;i<=a[0];i++) {
	    	if(a[0]%i==0) {
	    		arr.add(i);
	    	}
	    }
	    for(int i=0;i<arr.size();i++) {
	    	System.out.print(arr.get(i)+" ");
	    }
	    System.out.println();
	    for(int i=1;i<=a[1];i++) {
	    	if(a[1]%i==0) {
	    		arr1.add(i);
	    	}
	    }
	    for(int i=0;i<arr1.size();i++) {
	    	System.out.print(arr1.get(i)+" ");
	    }
	    System.out.println();
	    for(int i=1;i<=a[2];i++) {
	    	if(a[2]%i==0) {
	    		arr2.add(i);
	    	}
	    }
	    for(int i=0;i<arr2.size();i++) {
	    	System.out.print(arr2.get(i)+" ");
	    }
	    System.out.println();
	    int max = 0;
	    int min = 0;
	    for(int i=1; i<=a[0]; i++) {
	    	if(a[0]%i==0 && a[1]%i==0 && a[2]%i==0) {
	    		max = i;
	    	}
	    }
	    
	    for(int i=a[2]; i<=a[0]*a[1]*a[2]; i++) {
	    	if(i%a[0]==0 && i%a[1]==0 && i%a[2]==0) {
	    		min = i;
	    		break;
	    	}
	    }
	    System.out.println("程そ计" + max);
	    System.out.println("程そ计" + min);
	}
}



