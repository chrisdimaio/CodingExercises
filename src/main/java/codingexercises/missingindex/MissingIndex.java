package codingexercises.missingindex;

public class MissingIndex {
	public static void main(String[] args) {
		int[] indexes = {1,2,3,0,5,6};

		int n   = indexes.length;
		int sum = 0;
		for(int i = 0; i < indexes.length; i++){
			sum += indexes[i];
		}

		int missingIndex = (n * (n + 1) / 2) - sum;

		System.out.println((n * (n + 1) / 2));
		System.out.println(missingIndex);
	}
}