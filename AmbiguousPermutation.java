import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
class AmbiguousPermutation {
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		while (true) {
 
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			List<Integer> list = new ArrayList<Integer>();
			list.add(0);
			for (int j = 0; j < n; j++) {
				int t1 = sc.nextInt();
				list.add(t1);
			}
			boolean amb = true;
			for (int k = 1; k <= n; k++) {
				int tmp = list.get(k);
				if (k != list.get(tmp)) {
					amb = false;
					break;
				}
			}
			System.out.println(amb ? "ambiguous" : "not ambiguous");
		}
	}
}