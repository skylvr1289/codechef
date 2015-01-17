import java.util.Scanner;
 
class LifeUniverse {
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
 
		for (;;) {
			int x = sc.nextInt();
			if (x == 42)
				break;
			else
				System.out.println(x);
		}
 
	}
}