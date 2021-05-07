package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> someBingoNumbers = Arrays.asList("N40","N36","B6"); 
		
		List<String> gNumbers = new ArrayList<>();
		
		/*someBingoNumbers.forEach(number -> { if(number.startsWith("G"))
		{
			gNumbers.add(number);
			System.out.println(number);
		}
		});*/
		
		someBingoNumbers
		          .stream()
		          .map(String::toUpperCase)
		          .filter(s->s.startsWith("G"))
		          .sorted()
		          .forEach(System.out::println);
	}

}
