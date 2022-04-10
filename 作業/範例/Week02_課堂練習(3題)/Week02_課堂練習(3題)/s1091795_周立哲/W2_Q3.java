//資管二B 周立哲 410917952
//質因數分解進階版
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		System.out.print(n+" = ");
		for(int i = 2;;) {
			if(n%i==0) {
				count++;
				n/=i;
			}else {
				if(count>1) {
					System.out.print(i+"^"+count);
				}else if(count == 1) {
					System.out.print(i);
				}else if(count == 0) {
					i++;
					continue;
				}
				count = 0;
				i++;
				if(n==1) {
					break;
				}
				else {
					System.out.print("*");
				}
			}
		}
	}

}