package hatodikhet;

import java.time.LocalDate;

public class Alkalmazott {
	private String 		 name;
	private LocalDate    birthday;
	private int    		 salary;
	
	private static final int retirementAge = 65;
	private static LocalDate currentDate = LocalDate.now();
	private static String[] monthNames = {
			" ",
			"Januar",
			"Februar",
			"Marcius",
			"Aprilis",
			"Majus",
			"Junius",
			"Julius",
			"Augusztus",
			"Szeptember",
			"Oktober",
			"November",
			"December"
	};
	
	public Alkalmazott(String name, int year, int month, int day) {
		this.name = name;
		this.birthday = LocalDate.of(year, month, day);
		this.salary = 10000*(currentDate.getYear() - birthday.getYear()); 
	}
	
	public Alkalmazott(String name, int year, String month, int day) {
		this.name = name;Y
		int monthValue;
		if (convertMonthName(month) == 0) {
			monthValue = 1;
		} else {
			monthValue = convertMonthName(month);
		}
		this.birthday = LocalDate.of(year, monthValue, day);
		this.salary = 10000*(currentDate.getYear() - birthday.getYear()); 
	}

	
	
	public String convertMonthValue(int m) {
		return monthNames[m];
	}
	
	public int convertMonthName(String m) {
		for (int i = 1; i < monthNames.length; i++) {
			if (monthNames[i].equalsIgnoreCase(m)) {
				return i;
			}	
		}
		return 0;
	}
	
	
	public int yearsUntilRetirement() {
		return retirementAge - currentDate.getYear() - birthday.getYear();
	}
	
	public int getSalary() {
		return salary;
	}

	public static Alkalmazott isCloserToRetirement(Alkalmazott a, Alkalmazott b) {
		if (a.yearsUntilRetirement() <= b.yearsUntilRetirement()) {
			return b;
		} else if (a.yearsUntilRetirement() > b.yearsUntilRetirement()) {
			return a;
		} else {
			return a;
		}
	}

	
	
	
	
	
}
