package com.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorTest {
	/*Contains how to use comparable and comparator from Java*/
    public static void main(String[] args) {
    	
    		
        List<String> words = new ArrayList<>();

        words.add("dog");
        words.add("pen");
        words.add("sky");
        words.add("rock");
        words.add("den");
        words.add("fountain");
        words.sort(Comparator.naturalOrder());
        words.forEach(System.out::println);

        words.sort(Comparator.reverseOrder());
        words.forEach(System.out::println);
        System.out.println(words);
    }
}