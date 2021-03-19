package interviewquestion;

import java.util.Arrays;
import java.util.List;

public class FilterduplicateData {
	
	
	public static void filterduplicate(String number[]) {
		
		List<String> data = Arrays.asList(number);
		
		data.stream().distinct().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		String[] number= {"Jitu", "Ranjan", "Jitu", "Jitesh","Moleshwar"};
		filterduplicate(number);
	}

}
