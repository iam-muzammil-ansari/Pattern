public class Question16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print("   ");
            }
            for (int k = i; k <n; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = n-2; i>=0; i--) {
            for (int j = i; j <n; j++) {
                System.out.print("   ");
            }
            for (int k = i; k <n; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        
    }
}
