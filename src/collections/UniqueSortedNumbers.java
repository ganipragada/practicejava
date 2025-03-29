package collections;

//write a java program to print a unique numbers in given string and print
// a shorted order numbers are 1,3,5,6,7,,4,5,6,7,4,4,,8,9,0,9,7,6,6,5,4,4,3,2,1
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueSortedNumbers {
	public static void main(String[] args) {
		String input = "1,3,5,6,7,,4,5,6,7,4,4,,8,9,0,9,7,6,6,5,4,4,3,2,1";

		// Split the string by commas and handle empty elements
		String[] numberStrings = input.split(",");

		Set<Integer> uniqueNumbers = new HashSet<>();

		for (String numStr : numberStrings) {
			try {
				// Trim whitespace and parse to integer (handles empty strings)
				if (!numStr.trim().isEmpty()) {
					int number = Integer.parseInt(numStr.trim());
					uniqueNumbers.add(number);
				}
			} catch (NumberFormatException e) {
				System.out.println("Skipping invalid number: " + numStr);
			}
		}

		// Convert to TreeSet for automatic sorting
		TreeSet<Integer> sortedUniqueNumbers = new TreeSet<>(uniqueNumbers);

		// Print the result
		System.out.println("Unique numbers in sorted order:");
		System.out.println(sortedUniqueNumbers);

		// Alternative output without brackets
		System.out.println("\nAlternative output:");
		boolean first = true;
		for (int num : sortedUniqueNumbers) {
			if (!first) {
				System.out.print(",");
			}
			System.out.print(num);
			first = false;

		}

	}
}
