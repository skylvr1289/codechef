import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
class HolesInText {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("D", 1);
		map.put("O", 1);
		map.put("P", 1);
		map.put("Q", 1);
		map.put("R", 1);
 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String str = sc.next();
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				Object val = map.get(String.valueOf(str.charAt(j)));
				count = (val != null ? (Integer) val + count : count);
 
			}
			System.out.println(count);
		}
 
	}
}