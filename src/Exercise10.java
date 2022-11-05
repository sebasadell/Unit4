public class Exercise10 {
    public static void main(String argv[]){
        final char[] LETTERS = {'B', 'A', 'B', 'C', 'A', 'C', 'D', 'C', 'D', 'C', 'B', 'C', 'B', 'D', 'D', 'B', 'B', 'A', 'C', 'D'};
        int counter = 0;
        int max = 0;
        char maxChar = '.';

        for (int i = 0; i < LETTERS.length; i++){
            counter = 0;
            for (int j = 0; j < LETTERS.length; j++){
                if (LETTERS[i] == LETTERS[j]){
                    counter++;
                }
            }
            if (counter > max){
                max = counter;
                maxChar = LETTERS[i];
            }
        }
        System.out.println("The mode is '" + maxChar + "' with a count of: " + max);
    }
}
