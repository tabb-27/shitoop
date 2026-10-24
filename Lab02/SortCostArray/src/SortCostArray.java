import java.util.Scanner;
import java.util.Arrays;
public class SortCostArray {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++) {
        	numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers) + "\n");
        int sum = 0;
        double avg = 0.0d;
        for(int num : numbers) {
        	sum += num;
        }
        avg = sum/size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        
		
	}
}
