package numbers;

public class ArraySum {
    public static void main(String[] args) {
        int rows, cols;
        double sumRow, sumCol;

        //Initialize array a
        double shops[][] = {
                {12.45, 100.23, 96.99, 245.50},
                {11.39, 100.80, 94.78, 247.00},

        };

        //Calculates number of rows present in given array
        rows = shops.length;
        cols = shops[0].length;

        //Calculates sum of each row of given array
        for(int i = 0; i < rows; i++){
            sumRow = 0;
            for(int j = 0; j < cols; j++){
                sumRow = sumRow + shops[i][j];
            }
            System.out.println("Sum of " + (i+1)+" shop: "  + sumRow);
        }

    }
}
