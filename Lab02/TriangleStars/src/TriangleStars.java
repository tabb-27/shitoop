import java.util.Scanner;
public class TriangleStars {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input height of triangle :");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			String row = "*".repeat(i*2+1);
			System.out.println(row);
		}
		System.exit(0);
	}
}
