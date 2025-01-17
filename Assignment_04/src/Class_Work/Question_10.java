package Class_Work;
import java.util.*;
public class Question_10 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows (n): ");
		int n = sc.nextInt();
		String s = null;
		for (int i=1;i<=n;i++) {
			if (i==1) {
				System.out.println(i);
				s = Integer.toString(i);
			} else {
				s = s+i+s;
				System.out.println(s);
			}
		}
	}

}
