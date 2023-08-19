public class Question22 {
    public static void main(String[] args) {
        int numberOfLines = 5;
        printPattern (numberOfLines);
    }
    private static void printPattern(int numberOfLines) {
        // Initialize the stars and spaces and total Chracrater a/0 need pattern
        int numberOfSpaces = -1;
        int numberOfStars = numberOfLines;

        for(int i = 1; i <= numberOfLines; i ++) {
            // for left * print
            for(int j = 1; j <= numberOfStars; j ++) {
                System.out.print("*   ");
            }
            // for print space total between both stars left and right
            for(int j = 1; j <= numberOfSpaces; j ++) {
                System.out.print("    ");
            }
            // for right * print 
            for(int j = 1; j <= numberOfStars; j ++) {
                // handle one edge case for starting * first line
                if(j < numberOfLines) {
                    System.out.print("*   ");
                }
            }
            // increasing and decreasing stars and spaces a/o pattern
            numberOfSpaces += 2;
            numberOfStars --;
            System.out.println();
        }
    }
}
