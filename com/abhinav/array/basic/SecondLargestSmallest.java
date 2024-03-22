package com.abhinav.array.basic;

public class SecondLargestSmallest {
    public static void main(String[] args) {

    }
}

class SecondLargestSmallestSolution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int[] solutionArray = new int[2];
        int largestElement, secondLargestElement, smallestElement, secondSmallestElement;
        largestElement = secondLargestElement = Integer.MIN_VALUE;
        smallestElement = secondSmallestElement = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            largestElement = Math.max(largestElement, a[i]);
        }
        for (int i = 0; i < n; i++) {
            if (largestElement != a[i]) {
                secondLargestElement = Math.max(secondSmallestElement, a[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            smallestElement = Math.min(smallestElement, a[i]);
        }
        for (int i = 0; i < n; i++) {
            if (smallestElement != a[i]) {
                secondSmallestElement = Math.min(secondSmallestElement, a[i]);
            }
        }
        solutionArray[0] = secondLargestElement;
        solutionArray[1] = secondSmallestElement;

        return solutionArray;

    }
}
