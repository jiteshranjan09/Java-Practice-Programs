package steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamExp1 {

	public static void main(String[] args) {

		Integer[] studentmarks = {30,50,99,85,42,22,78,45,45,85,100};
		
		List<Integer> marks = Arrays.asList(studentmarks);
		
		//1. Sort the student with increamental order and print 
		 marks.stream().sorted().forEach(System.out::println);
		 
		 System.out.println("");
		 //2. Need distinct value
		 marks.stream().sorted().distinct().forEach(System.out::println);
		 
		 System.out.println("");
		 //3. Add all the no present in array (total marks)
		System.out.println("Total marks is "+  marks.stream().reduce(0, Integer::sum));
		
		System.out.println("");
		//4. find the max no 
		Integer maxMarks=marks.stream().max(Integer::compare).get();
		System.out.println("Maximum mark is " +maxMarks);
		
		System.out.println("");
		//5. find the no which can be divided by 5
		marks.stream().filter(i->i%5==0).sorted().forEach(System.out::println);
		
		System.out.println("");
		//6 find the odd no and do the sum
		System.out.println(marks.stream().filter(i->i%2!=0).reduce(0, Integer::sum));
		
		System.out.println("");
		//7. find the unique odd value and do the sum
		System.out.println(marks.stream().distinct().filter(i->i%2!=0).reduce(0, Integer::sum));
		
		//new stream
		Stream<Integer> marks1 =Stream.of(0,1,55,11,88,77,99,55,44,11,22,33,41,80);
		
		//Add two stream;
		Stream<Integer> finalno = Stream.concat(marks.stream(), marks1);
		
		System.out.println("");
		//printing 
		//finalno.forEach(System.out::println);
		
		//finding min no
		//Integer minno=finalno.min(Integer::compare).get();
		//System.out.println(minno);
		
		//unique no with sorted
		//finalno.sorted().distinct().forEach(System.out::println);
		
		//Find the no of occurance of any no
		//long occurance=finalno.filter(i->i==0).count();
		//System.out.println(occurance);
		
		//find some no from list
		//System.out.println(finalno.anyMatch(i->i==11));
		
		//find the first no
		//System.out.println(finalno.filter(i->i%7==0).map(i->i*5).findFirst());
		
		//Adding all marks
		//Integer totalmarks=finalno.sorted().reduce(0, Integer::sum);	
		//int per = (totalmarks/900)*100;
		//System.out.println(totalmarks +" " + per);
		
		//Coverting stream to list
		List<Integer> newlist= finalno.sorted().distinct().collect(Collectors.toList());
		System.out.println(newlist.get(5));
	}

}
