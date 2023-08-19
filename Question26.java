public class Question26 {
    public static void main(String[] args) {
        int numberOfLines = 5;
        printPattern (numberOfLines);
    }
    private static void printPattern(int numberOfLines) {
        
          // creating logic for space and stars
        int numberOfSpaces = numberOfLines - 1;
        int numberOfStars = 1;

        // traversal for lines
        for(int i = 1; i <= numberOfLines; i ++) {

            // traversal for spacesa print bcz first space printing
            for(int j = 1; j <= numberOfSpaces; j ++) {
                System.out.print("\t");
            }

            // traversal for printing the stars
            for (int j = 1; j <= numberOfStars; j ++) {
                // now we want same line print like a/o j increasing this loop print like that
                System.out.print(j + "\t");
            }
            System.out.println();

            // increasing the number of stars and number of spaces a/o pattern need
            numberOfSpaces --;
            numberOfStars += 2;
            
        }
    }
}
