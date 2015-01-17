import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class EnormusInput {
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
 
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		int n, k;
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
 
		int count = 0;
		for (int i = 0; i < n; i++) {
			int t = Integer.parseInt(br.readLine());
			count = (t % k == 0) ? count + 1 : count;
		}
		System.out.println(count);
	}
}
 