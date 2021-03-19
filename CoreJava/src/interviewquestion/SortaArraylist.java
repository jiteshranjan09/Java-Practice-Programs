package interviewquestion;

import java.util.Arrays;
import java.util.List;

public class SortaArraylist {
	
	public static void sorting(String text[]) {
		
		List<String> data = Arrays.asList(text);
		
		data.stream().sorted().forEach(System.out::println);
		System.out.println("====================");
		data.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		sorting(inputList);
	}

}
