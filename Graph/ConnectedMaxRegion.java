import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maxRegion function below.
    static int maxRegion(int[][] grid) {
        int maxRegion = 0;
        for(int row = 0; row<grid.length;row++){
            for(int col = 0; col<grid[row].length; col++){
                if(grid[row][col] == 1){
                    int size = getRegionSize(grid, row, col);
                    maxRegion = Math.max(size, maxRegion);
                }
            }
        }
        return maxRegion;
    }

    static int getRegionSize(int[][] grid, int row, int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[row].length){
            return 0;
        }
        if(grid[row][col] == 0){
            return 0;
        }
        grid[row][col] = 0;
        int size = 1;
        for(int r = row-1; r<=row+1; r++){
            for(int c = col-1; c<= col+1; c++) {
                size += getRegionSize(grid, r, c);
            }
        }
        return size;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] gridRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int gridItem = Integer.parseInt(gridRowItems[j]);
                grid[i][j] = gridItem;
            }
        }

        int res = maxRegion(grid);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
