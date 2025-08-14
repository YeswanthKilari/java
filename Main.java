import mysearch.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = Recursivebs.Recursivebs(arr, target, arr.length - 1, 0);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        int recursiveResult = Recursivebs.Recursivebs(arr, target, arr.length - 1,0);
        if (recursiveResult != -1) {
            System.out.println("Element found at index (recursive): " + recursiveResult);
        } else {
            System.out.println("Element not found (recursive)");
        }

        int lowerBound = Lowerb.lowerb(arr, target, arr.length);
        System.out.println("Lower bound of " + target + " is: " + lowerBound);

        int upperBound = Upperb.Upperb(arr, target, arr.length);
        System.out.println("Upper bound of " + target + " is: " + upperBound);
    }
}
