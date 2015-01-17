import java.util.Scanner;
 
class LeadGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int t = sc.nextInt();
		int max = 0;
		int winner=0;
		int c1=0,c2=0;
		for (int i = 0; i < t; i++) {
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			c1+=t1;
			c2+=t2;
			 int d=c1-c2;
			  if(max<Math.abs(d)){
				  max=Math.abs(d);
				  if(d>0)
					  winner=1;
				  else
					  winner=2;
				  
			  }
		}
		System.out.println(winner + " " + max);
 
	}
}