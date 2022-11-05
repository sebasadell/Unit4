public class Exercise8 {
    public static void main(String argv[]){
        int array[][] = new int[10][10];

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
    }
}