public class Question21 {
    public static void main(String[] args) {
        int numberOfLines = 5;
        printPattern (numberOfLines);
    }
    private static void printPattern(int numberOfLines) {
        // initialzise spaces and stars and totalch a/0 need
        int totalCh = 2 * numberOfLines - 1;
        int spaces = totalCh - 2;
        int stars = 1;
        for(int i = 1; i <= numberOfLines; i ++) {
            // for left * print
            for(int j = 1; j <= stars; j ++) {
                System.out.print("*   ");
            }
            // for print space total between both stars left and right
            for(int j = 1; j <= spaces; j ++) {
                System.out.print("    ");
            }
            // for stopping one edge case in last for i == numberOflines bcz i want to print -1 from numberOfstars otherwise one extraa * print
            if(i == numberOfLines) {
                stars --;
            }
            // right * print 
            for(int j = 1; j <= stars; j ++) {
                System.out.print("*   ");
            }
            // increasing and decreasing stars and spaces a/o pattern
            spaces -= 2;
            stars ++;
            System.out.println();
        }
    }
}
