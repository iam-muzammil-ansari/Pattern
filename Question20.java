public class Question20 {

    public static void main(String[] args) {
        int n = 7;
        for (int i = n/2 +1-1; i >0; i--) {
            for (int j = 0; j < n * 2; j++) {
                if (j == i || j == n - i-1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n/2 +1; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j == i || j == n - i-1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

