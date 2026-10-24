import java.util.Scanner;
public class MaxMinDiscount {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		String[] title = new String[size];
		double[] cost = new double[size];
		
		for(int i = 0; i < size; i++) {
			title[i] = input.nextLine();
			cost[i] = input.nextDouble();
			input.nextLine();
		}
		
		int maxIdx = 0, minIdx = 0;
		double total = 0.0;
		for(int i = 0; i < size; i++) {
			if(cost[i] > cost[maxIdx]) maxIdx = i;
			if(cost[i] < cost[minIdx]) minIdx = i;
			
			double finalCost = cost[i]>20 ? cost[i]*0.9 : cost[i];
			total += finalCost;
		}
		
		System.out.println("Max : " + title[maxIdx] + " - " + cost[maxIdx]);
		System.out.println("Min : " + title[minIdx] + " - " + cost[minIdx]);
		System.out.println("Total after discount :" + total);
		System.exit(0);
		
	}
}
