package in.ineuron.main;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		System.out.println("Enter the target number to find the index");
		Scanner sc = new Scanner(System.in);
		int targetValue = sc.nextInt();

		int[] array = new int[] { 1, 2, 3, 4, 5, 8, 16, 17, 58, 99 };
		Integer index = findIndex(targetValue, array);

		if (index == null)
			System.out.println("Target value index not found");
		else
			System.out.println("Index of the Target value " + targetValue + " is " + index);

		sc.close();
	}

	private static Integer findIndex(int value, int[] sortedArray) {

		int low = 0;
		int high = sortedArray.length - 1;

		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (sortedArray[mid] < value)
				low = mid + 1;
			else if (sortedArray[mid] > value)
				high = mid - 1;
			else
				return mid;
		}

		return null;
	}
}
