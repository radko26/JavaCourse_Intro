package main.java.com.sirma.itt.javacourse.intro.bigint;

/**
 * Own implementation of summing two big numbers
 * 
 * @author Radoslav
 */

class Main {

	/**
	 * 
	 * 
	 * @param args
	 */

	/**
	 * Method for printing a char to the screen
	 * 
	 * @param string
	 *            the number in char array so that can be read digit by digit
	 * @param len
	 *            the preferred length of the printed characters
	 */

	/**
	 * 
	 * @param string
	 *            our string for printing
	 * @param len
	 *            the size of the given string the result is printing every char
	 *            to the screen
	 */
	static void print(char[] string, int len) {
		for (int i = 0; i < len; i++)
			System.out.print(string[i]);
		System.out.println("");
	}

	/**
	 * main method which do all the calculations
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		char[] first = new char[100000];
		char[] second = new char[100000];
		char[] sum = new char[100000];
		int size = 10;

		for (int i = 0, value = 1; i < size; i++, value++) {
			if (value == 10)
				value = 0;
			first[i] = (char) (value % 7 + '0');
		}
		for (int i = 0, value = 9; i < size; i++, value--) {
			if (value == -1)
				value = 10;
			second[i] = (char) (value % 8 + '0');
		}

		print(first, size);
		print(second, size);

		boolean above10 = false;
		int value = 0;
		for (int firstNumberIndex = size - 1, secondNumberIndex = size - 1, sumIndex = size; sumIndex > -1; firstNumberIndex--, secondNumberIndex--, sumIndex--) {

			if (above10 == true)
				value = 1;
			else
				value = 0;
			// if there are digits to be added from the second number
			if (firstNumberIndex < 0 && secondNumberIndex >= 0) {
				value = value + (int) (second[secondNumberIndex] - '0');
			}
			// no digits left in the second but we add some from the first
			// number
			if (secondNumberIndex < 0 && firstNumberIndex >= 0) {
				value = value + (int) (first[firstNumberIndex] - '0');
			}
			// both numbers have digits
			if (secondNumberIndex >= 0 && firstNumberIndex >= 0) {
				value = value + (int) (first[firstNumberIndex] - '0')
						+ (int) (second[secondNumberIndex] - '0');
				if (value >= 10) {
					above10 = true;
					value = value % 10;
				} else
					above10 = false;
			}
			sum[sumIndex] = (char) (value + '0');
		}

		System.out.print("Sum: ");
		if (sum[0] - '0' != 0) {// nothing special, only checking if we need to
								// add new digit to the sum
			System.out.print(sum[0]);
		}
		for (int i = 1; i <= size; i++) {
			System.out.print(sum[i]);
		}
	}

}