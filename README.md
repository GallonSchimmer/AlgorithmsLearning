### README for the AlgorithmsLearning Project

#### Introduction
The AlgorithmsLearning project is dedicated to learning and implementing fundamental algorithms using Java. The focus of this project is on creating clear, efficient, and well-documented code to solve classic problems in computer science.

#### Current Algorithms
- **Binary Search**: Implemented in the `BinarySearchSimplerAlgorithm` class within the `binarySearchAlgorithm` package.

#### BinarySearchSimplerAlgorithm
The `BinarySearchSimplerAlgorithm` class demonstrates a simple implementation of the binary search algorithm on a sorted array of integers. This algorithm efficiently finds the position of a target value within the array.

##### Code Overview
The binary search operates by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

```java
package binarySearchAlgorithm;

public class BinarySearchSimplerAlgorithm {

    public static void main(String[] args) {

        int[] arr = {3, 7, 12, 19, 25, 30, 36};
        int target = 19; // Target value to find in the array

        int high = arr.length - 1;
        int low = 0;

        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middleIndexValue = arr[middleIndex];

            System.out.println("Checking middle index: " + middleIndex + " with value: " + middleIndexValue);

            if (middleIndexValue == target) {
                System.out.println("Target " + target + " found at index " + middleIndex);
                break;
            } else if (middleIndexValue < target) {
                low = middleIndex + 1;
            } else {
                high = middleIndex - 1;
            }
        }

        if (low > high) {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
```

##### Example Console Output
When the target is 19:
```
Checking middle index: 3 with value: 19
Target 19 found at index 3
```

When the target is not in the array:
```
Checking middle index: 3 with value: 19
Checking middle index: 5 with value: 30
Checking middle index: 4 with value: 25
Target 15 not found in the array.
```

#### Future Algorithms
Planned implementations include sorting algorithms and each algorithm will be added to the project with comprehensive documentation and examples of usage.

