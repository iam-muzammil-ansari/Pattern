public class Question10 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i=n-1; i>=0; i--) {
            for (int j=n; j>i; j--) {
                System.out.print("   ");
            }
            for (int k=0; k<=i*2; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
