package ua.krasnovnikita.bubbleproject;

public class BubbleSorting {

	private int[] array;

	public BubbleSorting() {
		super();
	}

	// filling an array with random values from 0 to 100
	public int[] fillArray(int length) {
		array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 101);
		}
		return array;
	}

	// sorting an array in the descending order
	public int[] sortArray(int[] inputVector) {
		this.array = inputVector;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public int[] getArray() {
		return array;
	}

}
