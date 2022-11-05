import java.util.Scanner;

public class Exercise5 {
    public static void main(String argv[]){
        int array[] = new int[10];
        int temp;
        Scanner inputValue;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            inputValue = new Scanner(System.in);
            array[i] = inputValue.nextInt();
        }
        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Reverse order array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}