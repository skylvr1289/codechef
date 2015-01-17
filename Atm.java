import java.util.Scanner;
 class Atm {
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
 
		int x;
		float y;
		x = sc.nextInt();
		y = sc.nextFloat();
		float reduction = 0.5f;
		float result = 0;
		result = (x % 5 == 0) ? (y - x - reduction) : y;
		System.out.println(result < 0 ? y : result);
 
	}
}