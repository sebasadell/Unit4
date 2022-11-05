public class Exercise9 {
    public static void main(String argv[]){
        int array[][] = new int[10][10];
        int rowCount = 0;
        int columnCount = 0;
        int rows = 0;
        int columns = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
                if ((i == 0 && j == 4) || (i == 2 && j == 6) || (i == 3 && j == 1) || (i == 8 && j == 6)){
                    array[i][j]=1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            rowCount = 0;
            columnCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 0){
                    rowCount++;
                }
                if (array[j][i] == 0){
                    columnCount++;
                }
            }
            if (rowCount == array.length){
                rows++;
            }
            if (columnCount == array.length){
                columns++;
            }
        }
        System.out.println("Rows with all 0s: " + rows);
        System.out.println("Columns with all 0s: " + columns);
    }
}