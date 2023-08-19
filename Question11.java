public class Question11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++) {
            for (int j=n-i-1; j>=0; j--) {
                System.out.print("   ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*     ");
            }
            System.out.println();
        }
    }
}
