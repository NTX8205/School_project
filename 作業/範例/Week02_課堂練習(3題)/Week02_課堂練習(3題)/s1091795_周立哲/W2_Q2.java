//��ޤGB �P�߭� 410917952
//�̱����ư��D
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		isprime iP = new isPrime();
		int n = sc.nextInt(), small=0, large=0;
		for(int i=n-1;i>1;i--) {
			if(iP.isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		for(int i=n+1; ;i++) {
			if(iP.isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		if((large-n) > (n-small)) {
			System.out.printf("�̱���%d�����%d", n, small);
		}
		else if((large-n)<(n-small)) {
			System.out.printf("�̱���%d�����%d", n, large);
		}
		else {
			System.out.printf("�̱���%d�����%d %d", n, small, large);
		}
	}
}