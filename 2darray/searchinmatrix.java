import java.util.*;

public class searchinmatrix {

    // Method to input elements into the matrix
    public static void input(int[][] arr, int n, int m, Scanner sc) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display the matrix
    public static void display(int[][] arr, int n, int m) {
        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to search for a key in a sorted 2D matrix
    public static boolean search(int[][] arr, int key) {
        int n = arr.length;
        int m = arr[0].length;
        int row = 0, col = m - 1;

        while (row < n && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found the key at: (" + row + ", " + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        input(arr, n, m, sc);
        display(arr, n, m);

        System.out.print("Enter the key you want to search: ");
        int key = sc.nextInt();

        search(arr, key);

        sc.close();
    }
}
