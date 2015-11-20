package codingexercises.missingindex;

import java.util.Arrays;

public class MissingIndex {
	public static void main(String[] args) {
		int[] indexes = {1,2,3,0,5,6};

		System.out.println("Array of indexes: " + Arrays.toString(indexes));

		int n   = indexes.length;
		int sum = 0;
		for(int i = 0; i < indexes.length; i++){
			sum += indexes[i];
		}

		int missingIndex = (n * (n + 1) / 2) - sum;

		System.out.println("The missing index is " + missingIndex + ".");
	}
}