package com.moh.file;

public class BetterProgrammerTask {

	public static void main(String[] args) {
		System.out.println(getSumOfNumbers("12 some text 3  7"));
	}

	public static int getSumOfNumbers(String s) {

		String[] tokens = s.split(" ");
		int sum = 0;
		for (String string : tokens) {
			if (isInteger(string)) {
				sum += Integer.valueOf(string);
			}
		}

		return sum;
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}



	public static int[] removeDuplicates(int[] a) {
		/*
		 * Please implement this method to remove all duplicates from the original array. Retain the order of the elements and always retain
		 * the first occurrence of the duplicate elements. For example, parameter: {2,1,2,3}, result: {2,1,3}
		 */

		Set<Integer> mySet = new LinkedHashSet<Integer>();

		for (int ctr = 0; ctr < a.length; ctr++) {
			mySet.add(a[ctr]);
		}

		System.out.println(mySet);
		return a;
	}







}
