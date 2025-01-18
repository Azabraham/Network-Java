package network;
import java.util.Scanner;

public class ClassTools {
	
	static Scanner input = new Scanner(System.in);
	
	public static String input(int i, String text) {
		System.out.println(String.format(text, i));
		return input.nextLine();
	}
	
	public static String input(String text) {
		System.out.println(text);
		return input.nextLine();
	}
	
}