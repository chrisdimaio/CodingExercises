package codingexercises.missingindex;

import java.util.Arrays;

public class MissingIndex {
	public static void main(String[] args) {
		// missing index 4.
		int[] indexes = {1,2,3,0,5,6};

		System.out.println("Array of indexes: " + Arrays.toString(indexes));

		System.out.println("The missing index is " + missingIndex(indexes) + ".");
	}

	public static int missingIndex(int[] indexes){
		int n   = indexes.length;
		int sum = 0;
		for(int i = 0; i < indexes.length; i++){
			sum += indexes[i];
		}

		return (n * (n + 1) / 2) - sum;
	}
}