import java.util.Scanner;

public class Exercise7 {
    public static void main(String argv[]){
        char[] array = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int num;
        Scanner inputValue;

        System.out.println("Enter your DNI number (without the letter): ");
        inputValue = new Scanner(System.in);
        num = inputValue.nextInt();
        int letter = num % 23;

        System.out.println("Your DNI's letter is: " + array[letter]);
    }
}