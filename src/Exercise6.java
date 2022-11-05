import java.util.Scanner;

public class Exercise6 {
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

        for (int i = 0; i < (array.length/2); i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reverse order array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}