//10. Find Intersection and Union of Two Arrays
//Find the intersection and union of two unsorted arrays.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionAndUnion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size and elements for the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input size and elements for the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Find the intersection and union of the two arrays
        Set<Integer> union = findUnion(arr1, arr2);
        Set<Integer> intersection = findIntersection(arr1, arr2);

        // Output the results
        System.out.println("Union of the two arrays: " + union);
        System.out.println("Intersection of the two arrays: " + intersection);

        scanner.close();
    }

    // Method to find the union of two arrays
    public static Set<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();
        
        // Add all elements of both arrays to the union set
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }

        return unionSet;
    }

    // Method to find the intersection of two arrays
    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> intersectionSet = new HashSet<>();
        Set<Integer> arr1Set = new HashSet<>();
        
        // Add all elements of the first array to a set
        for (int num : arr1) {
            arr1Set.add(num);
        }

        // Check if each element of the second array is in the first array set
        for (int num : arr2) {
            if (arr1Set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        return intersectionSet;
    }
}
