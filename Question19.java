public class Question19 {
    public static void main(String[] args) {
        int n = 7;

        // Upper part of the pattern
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= n / 2 + 2 - i; j++) {
                System.out.print("*   ");
            }

            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= n / 2 + 2 - i; j++) {
                if (j != n / 2 + 2) {
                    System.out.print("*   ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j <= n / 2 + 2 - i; j++) {
                System.out.print("*   ");
            }

            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= n / 2 + 2 - i; j++) {
                if (j != n / 2 + 2) {
                    System.out.print("*   ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
