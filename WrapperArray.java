/**
 * 
 */
package slideDeckExercises;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 */
public class WrapperArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double [] doubleArray = new Double[5];
		
		int i1 = 33;
		String i2 = "999.99";
		double i3 = 23.4;
		Integer i4 = 6669;
		Double i5 = 2.345;
		
		doubleArray[0] = (double) i1;
		doubleArray[1] = Double.parseDouble(i2);
		doubleArray[2] = i3;
		doubleArray[3] = i4.doubleValue();
		doubleArray[4] = i5;
		
		System.out.println("Unsorted");

		System.out.print("[");
		for (int i = 0; i < doubleArray.length; i++) {
			if (i == 4) {
				System.out.print(doubleArray[i]);
			} else {
				System.out.print(doubleArray[i] + ", ");
			}
		}
		System.out.println("]");
		
		System.out.println(Arrays.toString(doubleArray));
	
		Arrays.sort(doubleArray);
		
		System.out.println("Sorted");
		System.out.print("[");
		for (int i = 0; i < doubleArray.length; i++) {
			if (i == 4) {
				System.out.print(doubleArray[i]);
			} else {
				System.out.print(doubleArray[i] + ", ");
			}
		}
		System.out.println("]");
		
		System.out.println(Arrays.toString(doubleArray));
		
		
		
		
		
	}

}
