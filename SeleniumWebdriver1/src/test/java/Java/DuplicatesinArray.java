package Java;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicatesinArray {

	public static void main(String[] args) {
		
	        int[] arr = {1, 3, 4, 6, 1, 3, 56, 78, 99, 56, 4, 6, 7, 8, 9, 56};
	        HashSet<Integer> unique = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (int num : arr) {
	            if (!unique.add(num)) {
	                duplicates.add(num);
	            }
	        }

	        System.out.println("Duplicate numbers: " + duplicates);
	    }
      }

//What is a HashSet in Java?
//*HashSet is a part of Java's java.util package that implements the Set interface.
//*It is a collection that uses a hash table for storage and ensures that there are no duplicate elements.
//*A HashSet ensures that all elements are unique.
//*If you try to add a duplicate element, it ignores it and returns false.

//>unique HashSet: Stores all numbers from the array. It helps detect whether a number has been seen before.
//>duplicates HashSet: Stores only the numbers that are duplicates. This ensures each duplicate is added only once
//unique.add(num):
//If the number (num) is being added to unique for the first time, it returns true.
//If the number is already present in unique, it returns false.
//if (!unique.add(num)):
//If add(num) fails (the number is already in unique), it means the number is a duplicate.
//Add the number to the duplicates set using duplicates.add(num).
