package ua.krasnovnikita.bubbleproject;

public class StartSorting {

	public static void main(String[] args) {
		BubbleSorting bubbleSorting = new BubbleSorting();
		bubbleSorting.fillArray(20);
		int[] resultArray = bubbleSorting.getArray();
		
		// print to console the non-sorted array
		System.out.print("Non-sorted array: ");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
		
		bubbleSorting.sortArray(resultArray);
				
		// print to console the final result of the sorted array
		System.out.println();
		System.out.print("Sorted array: ");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}

	}

}
