package com.LeetCodePrograms;

import java.util.*;
import java.util.Arrays;

/*Print Pascal triangle with a list format*/

public class PascalTriangle {
	public static List<List<Integer>> generatePascalTriangle(int numRows) {
		List<List<Integer>> triangle = new ArrayList();
		List<Integer> firstRow = new ArrayList();
		firstRow.add(1);
		triangle.add(firstRow);
		for (int i = 1; i < numRows; i++) {
			List<Integer> prevRow = triangle.get(i - 1);
			List<Integer> currentRow = new ArrayList();
			currentRow.add(1);
			for (int j = 1; j < i; j++) {

				currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			currentRow.add(1);
			triangle.add(currentRow);
		}
		return triangle;
	}

	public static void main(String[] args) {

		int numRows = 5;
		List<List<Integer>> triangle=generatePascalTriangle(numRows);
		for (List<Integer> row : triangle) {
			System.out.println(row);
		}

	}
}