package Practice_problem;
import java.util.*;
public class Question_06 {
	public static int count(String str, char a) {
		int count=0;
		for(int i=0;i<=str.length();i++) {
			if(str.charAt(i)==a) {
				count +=1;
			}
		}
	return count;
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		System.out.print("Enter a character to search is -> ");
		char search=sc.next().charAt(0);
		System.out.println("Inputted String: " + str);
		System.out.println("Character to search: " + search);
		System.out.println("Count: " + count(str, search));
		sc.close();
	}
	
}
