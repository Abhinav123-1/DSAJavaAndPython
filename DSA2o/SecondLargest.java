package DSA2o;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        SecondLargestSolution sls = new SecondLargestSolution();
        System.out.println(sls.print2largest(arr, n));
    }
}

class SecondLargestSolution{
    public int print2largest(int a[], int n) {
        int largest = a[0];
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, a[i]);
        }
        for (int i = 0; i < n; i++) {
            if (largest != a[i]) {
                secondLargest = Math.max(secondLargest, a[i]);
            }
        }
        return secondLargest;
    }
}