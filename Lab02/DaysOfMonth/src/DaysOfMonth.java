
import java.util.Scanner;

public class DaysOfMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a month: ");
			String monthInput = input.nextLine().trim().toLowerCase();
			
			System.out.println("Enter a year: ");
			String yearInput = input.nextLine().trim();
			
			int month = getMonthNumber(monthInput);
			int year = convertYearToInteger(yearInput);
			
			if(month==-1 || year==-1) {
				System.out.println("Invalid month/year. Enter again: ");
				continue;
			}
			
			int days = getDay(month,year);
			System.out.println("Number of days " + days);
			break;
			
		}
	}
	
		
		
	private static int convertYearToInteger(String yearString) {
		try {
			int year = Integer.parseInt(yearString);
			if(year >= 0) {
				return year;
			}
		}
		catch(NumberFormatException e) {
			
		}
		return -1;
	}
	
	private static int getMonthNumber(String monthString) {
		
		switch(monthString) {
		case "january": case "jan.": case "jan": case "1": return 1;
        case "february": case "feb.": case "feb": case "2": return 2;
        case "march": case "mar.": case "mar": case "3": return 3;
        case "april": case "apr.": case "apr": case "4": return 4;
        case "may": case "5": return 5;
        case "june": case "jun.": case "jun": case "6": return 6;
        case "july": case "jul.": case "jul": case "7": return 7;
        case "august": case "aug.": case "aug": case "8": return 8;
        case "september": case "sep.": case "sep": case "9": return 9;
        case "october": case "oct.": case "oct": case "10": return 10;
        case "november": case "nov.": case "nov": case "11": return 11;
        case "december": case "dec.": case "dec": case "12": return 12;
        default: return -1; 
		}
		
	}
	
	private static int getDay(int month, int year) {
		if(month == 2) {
			boolean isLeapYear = (year%4==0 && year%100!=0) || (year%400==0);
			return isLeapYear?29:28;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        
        return 31;
	}
}
