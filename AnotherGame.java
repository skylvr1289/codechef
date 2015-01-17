import java.util.Scanner;
 
class AnotherGame {
 
	public static void main(String[] args) {
		String ALICE = "ALICE";
		String BOB = "BOB";
 
		Scanner sc = new Scanner(System.in);
 
		int T = sc.nextInt();
 
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			if (n == 1)
				System.out.println(BOB);
			else if (n % 2 == 0)
				System.out.println(ALICE);
			else
				System.out.println(BOB);
		}
	}
}