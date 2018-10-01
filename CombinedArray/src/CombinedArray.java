import java.util.Scanner;

public class CombinedArray {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int size1;
        int size2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array 1: ");
        size1 = scanner.nextInt();
        array1 = new int[size1];
        System.out.println("Enter element of array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println((i + 1) + ". ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter size of array 2: ");
        size2 = scanner.nextInt();
        System.out.println("Enter element of array 2: ");
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println((i + 1) + ". ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Array 3 is combined by array 1 and array 2: " + "");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
