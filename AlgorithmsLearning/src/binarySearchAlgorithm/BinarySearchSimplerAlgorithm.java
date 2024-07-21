package binarySearchAlgorithm;

public class BinarySearchSimplerAlgorithm {

	public static void main(String[] args) {

		int[] arr = { 3, 7, 12, 19, 25, 30, 36 };
		int target = 35;

		// bounds
		int high = arr.length - 1;
		int low = 0;

		// search while low is < to high --> target is not in array
		while (low < high) {
			// the last loop will update the low to == to high and check if target present

			// recalculating average depending on low + high / 2
			int middleIndex = (low + high) / 2;
			System.out.println("low: " + low + " " + "high: " + high);
			System.out.println("middle index: " + middleIndex + " target: " + target);

			// compare middle value with target and if found break loop
			int middleIndexValue = arr[middleIndex];
			System.out.println("middleIndexValue: " + middleIndexValue + " target: " + target);

			if (middleIndexValue == target) {
				System.out.println("middleIndexValue equal to target: " + middleIndexValue + " " + middleIndexValue);
				break;

			} else {

				// if middle less than target--> low : middle + 1 else middle greater than
				// target --> high: middle -1
				if (middleIndexValue < target) {

					low = middleIndex + 1;
					System.out.println("middleIndexValue in sortet array less than target");
					System.out.println("new low: " + low);

					if (low == high) {
						if (arr[low] == target) {
							System.out.println("new low value equal to target: " + arr[low] + " " + target);
							break;
						}
						System.out.println("low equal to high, last print before loop iteration, middleIndexValue: " + middleIndexValue);
						System.out.println("not found target: " + target);
						System.out.println("high: " + high);
						System.out.println("low equal to high, target isn't in the array");

						
						break;
					}

				} else if (middleIndexValue > target) {

					high = middleIndex - 1;
					System.out.println("middleIndexValue in sortet array greater than target");
					System.out.println("new high: " + high);

					if (low == high) {
						if (arr[high] == target) {
							System.out.println("new low value equal to target: " + arr[high] + " " + target);
							break;
						}
						System.out.println("low equal to high, last print before loop iteration, middleIndexValue: " + middleIndexValue);
						System.out.println("not found target: " + target);
						System.out.println("low: " + low);
						System.out.println("low equal to high, target isn't in the array");

						
						break;
					}

				} // end else if

				// print again
				System.out.println(
						"print before loop iteration,  middleIndexValue: " + middleIndexValue + " " + "target index: " + target);

			} // end first else

		} // end while

	}// end main

}// end class
