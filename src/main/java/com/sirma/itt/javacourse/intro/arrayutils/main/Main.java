package main.java.com.sirma.itt.javacourse.intro.arrayutils.main;

import main.java.com.sirma.itt.javacourse.intro.arrayutils.arraymanipulator.Manipulator;

/**
 * 
 * 
 * @author Radoslav
 */

public class Main {
	/**
	 * Main class for running the arrayUtils
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = -1;
		arr[1] = 91;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 0;
		// declaring a Manipulator class which do all the work
		Manipulator manipulator = new Manipulator(arr);
		manipulator.printArray();
		System.out.println(manipulator.getMinElement());
		System.out.println(manipulator.getSum());
		manipulator.reverse();
		manipulator.printArray();
		manipulator.mWeight();
		// manipulator.qsort(0, 4);

		manipulator.printArray();
	}

}
